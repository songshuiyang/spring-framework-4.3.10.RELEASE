package org.springframework.iframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.common.mo.ResponseMO;
import org.springframework.iframe.common.mo.base.BaseController;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;
import org.springframework.web.bind.annotation.*;

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
    public ResponseMO list(@RequestBody IUser iUser) {
        List<IUser> userList = userService.findAll();
        return success(userList);
    }

//    @GetMapping("/list") 相同链接会报错
    public ResponseMO list1(@RequestBody IUser iUser) {
        List<IUser> userList = userService.findAll();
        return success(userList);
    }

    @PostMapping("/update")
    public ResponseMO update(@RequestBody IUser iUser) {
        userService.updateUserByRuntimeException(iUser);
        return success();
    }

    @GetMapping("/view/{id}/{name}")
    public ResponseMO view(@PathVariable Integer id, @PathVariable String name) {
        IUser iUser = userService.selectByPrimaryKey(id);
        iUser.setUsername(name);
        return success(iUser);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseMO delete(@PathVariable Integer id) {
        userService.deleteByPrimaryKey(id);
        return success();
    }

    /**
     * 普通方法
     *
     * @param id
     * @return
     */
    public  ResponseMO generalMethod (@PathVariable Integer id) {
        userService.deleteByPrimaryKey(id);
        return success();
    }
}
