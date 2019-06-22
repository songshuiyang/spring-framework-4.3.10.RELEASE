package org.springframework.iframe.entity;

import lombok.Data;

/**
 * @author songsy
 * @date 2019/5/23 11:10
 */
@Data
public class User {

    private String userName;

    private Integer age;

    private Role role;

    public User() {
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
