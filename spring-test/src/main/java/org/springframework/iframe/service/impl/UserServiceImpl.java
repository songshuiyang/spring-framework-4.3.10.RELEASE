package org.springframework.iframe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.entity.Role;
import org.springframework.iframe.entity.User;
import org.springframework.iframe.service.RoleService;
import org.springframework.iframe.service.UserService;
import org.springframework.stereotype.Service;


/**
 * @author songshuiyang
 * @date 2019/6/3 22:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    User user;

    @Autowired
    private RoleService roleService;

    @Override
    public User findUserByName(String userName) {
        User user = new User(userName,18);
        //Role role = roleService.findRoleByUserName(userName);
        user.setRole(new Role());
        return user;
    }

}
