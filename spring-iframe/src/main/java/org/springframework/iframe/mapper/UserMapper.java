package org.springframework.iframe.mapper;

import org.springframework.iframe.entity.IUser;

import java.util.List;

/**
 * 用户
 * @author songshuiyang
 * @date 2017/11/28 20:12
 */
public interface UserMapper {

    List<IUser> findAll();

    IUser selectByPrimaryKey(Integer id);

    int insertSelective(IUser iUser);

    int updateByPrimaryKeySelective(IUser iUser);

}