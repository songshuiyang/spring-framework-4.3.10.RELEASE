package org.springframework.iframe.service;


import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.exception.CouponException;

import java.util.List;

/**
 * @author songshuiyang
 * @date 2019/6/3 22:47
 */
public interface UserService {

    List<IUser> findAll();

    IUser selectByPrimaryKey(Integer id);

    int insertSelective(IUser iUser);

    int updateByPrimaryKeySelective(IUser iUser);

    int deleteByPrimaryKey(Integer id);

    IUser findUserByName(String userName);

    void updateUserByCompilationException(IUser iUser) throws CouponException;

    void updateUserByCompilationExceptionRollback(IUser iUser) throws CouponException;

    void updateUserByRuntimeException(IUser iUser) throws NullPointerException;

}
