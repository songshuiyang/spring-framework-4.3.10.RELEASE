package org.springframework.iframe.beans.initializing;

import lombok.Data;

/**
 * @author songsy
 * @date 2020/8/11 16:30
 */
@Data
public class UserBean {

    private String name;

    public void init() {
        name = "初始化的名字";
    }

}
