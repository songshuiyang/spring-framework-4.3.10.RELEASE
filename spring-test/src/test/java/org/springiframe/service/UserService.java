package org.springiframe.service;

import org.springiframe.entity.User;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:47
 */
public interface UserService {

    User findUserByName (String userName);

}
