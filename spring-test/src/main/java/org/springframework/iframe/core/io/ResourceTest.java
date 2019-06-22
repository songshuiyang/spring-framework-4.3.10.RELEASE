package org.springframework.iframe.core.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

/**
 * @author songshuiyang
 * @date 2019/6/9 11:05
 */
@Slf4j
public class ResourceTest {

    @Test
    public void createFileSystemResourceByFile() throws Exception {
        File file = new File("D://1.txt");
        FileSystemResource fileSystemResource = new FileSystemResource(file);
    }

    @Test
    public void createFileSystemResourceByPath() throws Exception {
        FileSystemResource fileSystemResource = new FileSystemResource("D://1.txt");

    }

    @Test
    public void createClassPathResourceByFile() throws Exception {
        ClassPathResource classPathResource = new ClassPathResource("beans/bean.xml");
    }
}
