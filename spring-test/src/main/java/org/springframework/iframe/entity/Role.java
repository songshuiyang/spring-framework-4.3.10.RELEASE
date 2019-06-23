package org.springframework.iframe.entity;

import lombok.Data;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:51
 */
@Data
public class Role {

    private String roleName;

    private String roleCole;

    public Role() {
    }

    public Role(String roleName, String roleCole) {
        this.roleName = roleName;
        this.roleCole = roleCole;
    }
}
