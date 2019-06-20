package org.springiframe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springiframe.entity.Role;
import org.springiframe.entity.User;
import org.springiframe.service.RoleService;
import org.springiframe.service.UserService;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:49
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired User user;

    @Autowired
    private RoleService roleService;

    @Override
    public User findUserByName(String userName) {
        User user = new User(userName,18);
        Role role = roleService.findRoleByUserName(userName);
        user.setRole(role);
        return user;
    }

}
