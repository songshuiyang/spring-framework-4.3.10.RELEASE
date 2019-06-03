package org.springiframe.service;

import org.springiframe.entity.Role;
import org.springiframe.entity.User;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:48
 */
public interface RoleService {

    Role findRoleByUserName (String userName);

}
