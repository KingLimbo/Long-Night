/*
 * Copyright © 2020 - 2021 www.limbodevil.top
 */

package com.limbo.practice.base.controller;

import com.limbo.practice.base.dao.SysUserDao;
import com.limbo.practice.base.entity.SysUser;
import com.limbo.practice.base.service.SysUserService;
import com.limbo.practice.core.base.BaseController;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
*
* @ProjectName: long-night
* @PackageName: com.limbo.practice.base.controller
* @ClassName: SysUserController
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author: limbo
* @Date: 2021-02-20 09:46:12
* @Modifier: limbo
* @ModifiedDate: 2021-02-20 09:46:12
*
* version V1.0
*/

@Api(tags = "系统用户")
@Controller
@RequestMapping("/sys-user")
public class SysUserController extends BaseController<SysUser, SysUserDao> {

    @Autowired
    private SysUserService<SysUser, SysUserDao> sysUserServiceImpl;

    @PostConstruct
    public void initService(){
        setService(sysUserServiceImpl);
    }
}