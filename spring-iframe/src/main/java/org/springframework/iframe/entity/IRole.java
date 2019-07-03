package org.springframework.iframe.entity;

import lombok.Data;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:51
 */
@Data
public class IRole {

    private String roleName;

    private String roleCole;

    public IRole() {
    }

    public IRole(String roleName, String roleCole) {
        this.roleName = roleName;
        this.roleCole = roleCole;
    }
}
