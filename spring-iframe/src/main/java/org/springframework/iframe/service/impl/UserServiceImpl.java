package org.springframework.iframe.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.entity.IRole;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.exception.CouponException;
import org.springframework.iframe.mapper.UserMapper;
import org.springframework.iframe.service.RoleService;
import org.springframework.iframe.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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
    public List<IUser> findAll() {
        return userMapper.findAll();
    }


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
    @Transactional
    public void updateUserByCompilationException (IUser iUser) throws CouponException{
        log.info("开启事务");
        if (userMapper.insertSelective(iUser) == 1) {
            throw new CouponException("编译型异常 事务不回滚");
        }
        IUser iUser2 = userMapper.selectByPrimaryKey(1);
        iUser2.setAge(iUser2.getAge() + 1);
        userMapper.updateByPrimaryKeySelective(iUser2);
    }

    // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUserByCompilationExceptionRollback (IUser iUser) throws CouponException{
        log.info("开启事务");
        if (userMapper.insertSelective(iUser) == 1) {
            throw new CouponException("编译型异常 事务会回滚");
        }
        IUser iUser2 = userMapper.selectByPrimaryKey(1);
        iUser2.setAge(iUser2.getAge() + 1);
        userMapper.updateByPrimaryKeySelective(iUser2);
    }

    @Override
    @Transactional
    public void updateUserByRuntimeException (IUser iUser) throws NullPointerException{
        log.info("开启事务");
        if (userMapper.insertSelective(iUser) == 1) {
            throw new NullPointerException("运行时异常");
        }
        IUser iUser2 = userMapper.selectByPrimaryKey(1);
        iUser2.setAge(iUser2.getAge() + 1);
        userMapper.updateByPrimaryKeySelective(iUser2);
    }

}
