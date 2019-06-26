package org.springframework.iframe.mapper;

import org.springframework.iframe.entity.IUser;

/**
 * 用户
 * @author songshuiyang
 * @date 2017/11/28 20:12
 */
public interface UserMapper {

    IUser selectByPrimaryKey (Integer id);

}