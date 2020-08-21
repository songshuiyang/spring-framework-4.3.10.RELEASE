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
public class UserRequiresMandatoryService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRequiresMandatoryService userService;

    //@Transactional(propagation = Propagation.REQUIRED)
    public void insertAll() {
        IUser iUser1 = new IUser();
        iUser1.setUsername("小宋1");
        userService.insert(iUser1);

        IUser iUser3 = new IUser();
        iUser3.setUsername("小宋3");
        userService.insert(iUser3);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void insert(IUser user){
        userMapper.insertSelective(user);
    }


}
