package org.springiframe.entity;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:51
 */
public class Role {

    private String roleName;

    private String roleCole;

    public Role() {
    }

    public Role(String roleName, String roleCole) {
        this.roleName = roleName;
        this.roleCole = roleCole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCole() {
        return roleCole;
    }

    public void setRoleCole(String roleCole) {
        this.roleCole = roleCole;
    }
}
