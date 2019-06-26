package org.springframework.iframe.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.entity.IRole;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.exception.CouponException;
import org.springframework.iframe.mapper.UserMapper;
import org.springframework.iframe.service.RoleService;
import org.springframework.iframe.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.io.File;


/**
 * @author songshuiyang
 * @date 2019/6/3 22:49
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUser (IUser iUser) {
        log.info("开启事物");
        try {
            userMapper.insertSelective(iUser);
            throw new CouponException("df");
        } catch (CouponException e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        IUser iUser2 = userMapper.selectByPrimaryKey(1);
        iUser2.setAge(iUser2.getAge() + 1);
        userMapper.updateByPrimaryKeySelective(iUser2);
    }

}
