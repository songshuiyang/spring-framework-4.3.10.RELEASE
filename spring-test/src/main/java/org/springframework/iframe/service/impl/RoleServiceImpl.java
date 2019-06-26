package org.springframework.iframe.service.impl;

import org.springframework.iframe.entity.IRole;
import org.springframework.iframe.service.RoleService;
import org.springframework.stereotype.Service;


/**
 * @author songshuiyang
 * @date 2019/6/3 22:49
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public IRole findRoleByUserName(String userName) {
        return new IRole("超级管理员","admin");
    }
}
