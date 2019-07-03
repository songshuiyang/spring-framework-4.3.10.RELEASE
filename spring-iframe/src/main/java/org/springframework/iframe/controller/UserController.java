package org.springframework.iframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.common.mo.ResponseMO;
import org.springframework.iframe.common.mo.base.BaseController;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author songsy
 * @date 2019/7/3 9:57
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseMO list() {
        List<IUser> userList = userService.findAll();
        return success(userList);
    }

}
