package org.springframework.iframe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.entity.IRole;
import org.springframework.iframe.entity.IUser;
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
    private RoleService roleService;

    @Override
    public IUser findUserByName(String userName) {
        IUser user = new IUser();
        user.setUsername("songsy");
        user.setAge(1);
        //IRole IRole = roleService.findRoleByUserName(userName);
        user.setIRole(new IRole());
        return user;
    }

}
