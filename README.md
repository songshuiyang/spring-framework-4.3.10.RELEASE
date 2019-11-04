## 为什么要阅读源码

* 站在巨人的肩膀上看世界，看看大佬们是怎么写代码的，一些写代码的模式或者技巧是否可以运用到实际项目中
* 许多东西不能只停留在使用层面，更要知其所以然，提高自己知识的深度
* 可以融会贯通，看得越多，知识的互通性的愈发明显，比如一些设计思想，设计模式这些在其他框架也是大量的运用

## 下载并导入源码

* 源码地址 `https://github.com/spring-projects/spring-framework` 选择合适的版本，此版本是`4.3.10.RELEASE`版本

* 配置`gradle`环境

* 详情可见源码父目录下的`import-into-idea.md`说明文档来将源码导入到`IDEA`环境中，执行`import-into-eclipse.bat`脚本将源码可导入至`eclipse`环境中

* 导入到`IDEA`环境中操作步骤
    * 进入 `spring-framework` 文件夹下，打开`cmd`，输入 `gradlew :spring-oxm:compileTestJava` ，`spring-oxm` 应该预编译，因为它使用重新打包的依赖项，被其他包依赖
    
    * 排除 `spring-aspects` 模块 `1、Exclude(Go to File->Project Structure->Modules)` 2、右键`unmark as sources root`让`idea`不认为此目录是源代码文件夹，不然此模块不然在本地编译不过
    
    * 执行`gradlew.bat`

## 问题记录
* 执行`gradle`命令报错
    * 尝试更换版本，多下几个版本的`gradle`

* 执行`gradle`命令报`错误: 找不到或无法加载主类 org.gradle.wrapper.GradleWrapperMain`
    * 检查源码目录下是否有 `gradle/wrapper/gradle-wrapper.jar`，如果没有从其他项目中copy一份
   
* 执行`gradle`命令报`taskdef class jdiff.JDiffAntTask cannot be found`
    * 注释该文件的下面代码
    ```xml
    ant.taskdef(
            name: "jdiff",
            classname: "jdiff.JDiffAntTask",
            classpath: "${jdiffHome}/antjdiff.jar")
    ```
    
* 有些类`GroovyBeanDefinitionReader` ``GroovyBeanDefinitionReader``编译报错说是找不到
    * 找到对应`GroovyBeanDefinitionReader`的模块是`spring-beans-groovy` 
    * 然后在找到`build.gradle`文件将`compile(project(":spring-beans-groovy"))`依赖添加到对于报错的模块中
        ```java
        project("spring-context") {
            description = "Spring Context"
        
            apply plugin: "groovy"
        
            dependencies {
                compile(project(":spring-aop"))
                compile(project(":spring-beans"))
                compile(project(":spring-beans-groovy"))
        ```

* 设置测试类不编译，修改文件`build.gradle`，不然每次点击方法在哪里调用都会冒出一堆测试类供你选择

```java
sourceSets {
    test {
        java.srcDirs = ['src/排除test目录']
    }
}

test {
    systemProperty("java.awt.headless", "true")
    systemProperty("testGroups", project.properties.get("testGroups"))
    scanForTestClasses = false
    include(["**/*Tests.class", "**/*Test.class"])
    // Since we set scanForTestClasses to false, we need to filter out inner
    // classes with the "$" pattern; otherwise, using -Dtest.single=MyTests to
    // run MyTests by itself will fail if MyTests contains any inner classes.
    exclude '*'
}

```


















## Spring Framework
The Spring Framework provides a comprehensive programming and configuration
model for modern Java-based enterprise applications -- on any kind of deployment
platform. A key element of Spring is infrastructural support at the application
level: Spring focuses on the "plumbing" of enterprise applications so that teams
can focus on application-level business logic, without unnecessary ties to
specific deployment environments.

The framework also serves as the foundation for [Spring Integration][], [Spring Batch][]
and the rest of the Spring [family of projects][]. Browse the repositories under
the [Spring organization][] on GitHub for a full list.

## Code of Conduct
This project adheres to the Contributor Covenant [code of conduct](CODE_OF_CONDUCT.adoc).
By participating, you  are expected to uphold this code. Please report unacceptable behavior to spring-code-of-conduct@pivotal.io.

## Downloading Artifacts
See [downloading Spring artifacts][] for Maven repository information. Unable to
use Maven or other transitive dependency management tools?
See [building a distribution with dependencies][].

## Documentation
See the current [Javadoc][] and [reference docs][].

## Getting Support
Check out the [spring][spring tags] tags on [Stack Overflow][]. [Commercial support][]
is available too.

## Issue Tracking
Report issues via the [Spring Framework JIRA][]. Understand our issue management
process by reading about [the lifecycle of an issue][]. Think you've found a
bug? Please consider submitting a reproduction project via the
[spring-framework-issues][] GitHub repository. The [readme][] there provides
simple step-by-step instructions.

## Building from Source
The Spring Framework uses a [Gradle][]-based build system. In the instructions
below, [`./gradlew`][] is invoked from the root of the source tree and serves as
a cross-platform, self-contained bootstrap mechanism for the build.

### Prerequisites

[Git][] and [JDK 8 update 20 or later][JDK8 build]

Be sure that your `JAVA_HOME` environment variable points to the `jdk1.8.0` folder
extracted from the JDK download.

### Check out sources
`git clone git@github.com:spring-projects/spring-framework.git`

### Import sources into your IDE
Run `./import-into-eclipse.sh` or read `import-into-idea.md` as appropriate.
> **Note:** Per the prerequisites above, ensure that you have JDK 8 configured properly in your IDE.

### Install all spring-\* jars into your local Maven cache
`./gradlew install`

### Compile and test; build all jars, distribution zips, and docs
`./gradlew build`

... and discover more commands with `./gradlew tasks`. See also the [Gradle
build and release FAQ][].

## Contributing
[Pull requests][] are welcome; see the [contributor guidelines][] for details.

## Staying in Touch
Follow [@SpringCentral][] as well as [@SpringFramework][] and its [team members][]
on Twitter. In-depth articles can be found at [The Spring Blog][], and releases
are announced via our [news feed][].

## License
The Spring Framework is released under version 2.0 of the [Apache License][].

[Spring Integration]: https://github.com/spring-projects/spring-integration
[Spring Batch]: https://github.com/spring-projects/spring-batch
[family of projects]: http://spring.io/projects
[Spring organization]: https://github.com/spring-projects
[downloading Spring artifacts]: https://github.com/spring-projects/spring-framework/wiki/Downloading-Spring-artifacts
[building a distribution with dependencies]: https://github.com/spring-projects/spring-framework/wiki/Building-a-distribution-with-dependencies
[Javadoc]: http://docs.spring.io/spring-framework/docs/current/javadoc-api/
[reference docs]: http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/
[spring tags]: http://spring.io/questions
[Stack Overflow]: http://stackoverflow.com/faq
[Commercial support]: http://spring.io/services
[Spring Framework JIRA]: https://jira.spring.io/browse/SPR
[the lifecycle of an issue]: https://github.com/spring-projects/spring-framework/wiki/The-Lifecycle-of-an-Issue
[spring-framework-issues]: https://github.com/spring-projects/spring-framework-issues#readme
[readme]: https://github.com/spring-projects/spring-framework-issues#readme
[Gradle]: http://gradle.org
[`./gradlew`]: http://vimeo.com/34436402
[Git]: http://help.github.com/set-up-git-redirect
[JDK8 build]: http://www.oracle.com/technetwork/java/javase/downloads
[Gradle build and release FAQ]: https://github.com/spring-projects/spring-framework/wiki/Gradle-build-and-release-FAQ
[Pull requests]: http://help.github.com/send-pull-requests
[contributor guidelines]: https://github.com/spring-projects/spring-framework/blob/master/CONTRIBUTING.md
[@SpringFramework]: https://twitter.com/springframework
[@SpringCentral]: https://twitter.com/springcentral
[team members]: https://twitter.com/springframework/lists/team/members
[The Spring Blog]: http://spring.io/blog/
[news feed]: http://spring.io/blog/category/news
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
