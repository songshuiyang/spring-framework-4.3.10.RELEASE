package org.springiframe.service.impl;

import org.springframework.stereotype.Service;
import org.springiframe.entity.Role;
import org.springiframe.service.RoleService;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:49
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public Role findRoleByUserName(String userName) {
        return new Role("超级管理员","admin");
    }
}
