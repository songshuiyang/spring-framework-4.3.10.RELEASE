package org.springframework.iframe.entity;

import lombok.Data;

/**
 * @author songsy
 * @date 2019/5/23 11:10
 */
@Data
public class IUser {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private IRole iRole;
}
