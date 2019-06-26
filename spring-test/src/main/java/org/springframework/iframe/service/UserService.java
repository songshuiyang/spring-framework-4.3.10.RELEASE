package org.springframework.iframe.service;


import org.springframework.iframe.entity.IUser;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:47
 */
public interface UserService {

    IUser findUserByName(String userName);

}
