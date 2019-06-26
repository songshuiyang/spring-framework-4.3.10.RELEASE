package org.springframework.iframe.service;


import org.springframework.iframe.entity.IRole;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:48
 */
public interface RoleService {

    IRole findRoleByUserName(String userName);

}
