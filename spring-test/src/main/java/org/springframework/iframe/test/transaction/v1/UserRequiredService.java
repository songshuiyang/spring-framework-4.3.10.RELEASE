package org.springframework.iframe.test.transaction.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author songsy
 * @date 2020/8/21 10:10
 */
@Slf4j
@Service
public class UserRequiredService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRequiredService userService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertAll() {
        IUser iUser1 = new IUser();
        iUser1.setUsername("小宋1");
        userService.insert(iUser1);

        try {
            IUser iUser2 = new IUser();
            iUser2.setUsername("小宋2");
            userService.insertByException(iUser2);
        } catch (Exception e) {
            log.error("回滚拉", e);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(IUser user){
        userMapper.insertSelective(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertByException(IUser user){
        userMapper.insertSelective(user);
        throw new RuntimeException();
    }

}
