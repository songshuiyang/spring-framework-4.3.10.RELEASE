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
public class UserService {

    @Autowired
    private UserMapper userMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    public void insertAll() {
        IUser iUser1 = new IUser();
        iUser1.setUsername("小宋1");
        insert(iUser1);


        IUser iUser2 = new IUser();
        iUser2.setUsername("小宋2");
        insertByException(iUser2);

        //throw new NullPointerException();
    }


    public void insert(IUser user){
        userMapper.insertSelective(user);
    }

    public void insertByException(IUser user){
        userMapper.insertSelective(user);
        if (true) {
            throw new RuntimeException();
        }
        IUser user4 = new IUser();
        user4.setUsername("小宋4");
        userMapper.insertSelective(user4);
    }

}
