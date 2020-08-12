package org.springframework.iframe.beans.initializing;

import javax.annotation.PostConstruct;

/**
 * @author songsy
 * @date 2020/8/11 16:43
 */
public class PostConstructBean {

    private String name;

    @PostConstruct
    public void init() {
        name = "初始化的名字";
    }

}
