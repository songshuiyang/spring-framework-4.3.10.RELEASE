package org.springframework.iframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.iframe.common.mo.ResponseMO;
import org.springframework.iframe.common.mo.base.BaseController;
import org.springframework.iframe.entity.IRole;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songsy
 * @date 2019/7/3 9:57
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    public ResponseMO list(@RequestBody IRole iRole) {
        List<IRole> roleList = new ArrayList<>();
        IRole iRole1 = new IRole();
        iRole1.setRoleName("超级管理员");
        iRole1.setRoleCole("admin");
        roleList.add(iRole1);
        return success(roleList);
    }

    @PostMapping("/update")
    public ResponseMO update(@RequestBody IUser iUser) {
        return success();
    }

    @GetMapping("/view/{id}")
    public ResponseMO view(@PathVariable Integer id) {

        return success();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseMO delete(@PathVariable Integer id) {
        return success();
    }


    /**
     * 普通方法
     *
     * @param id
     * @return
     */
    public  ResponseMO generalMethod (@PathVariable Integer id) {
        return success();
    }

}
