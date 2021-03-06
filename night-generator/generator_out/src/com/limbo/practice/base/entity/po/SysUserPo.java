/*
 * Copyright © 2020 - 2021 www.limbodevil.top
 */

package com.limbo.practice.base.entity.po;

import com.limbo.practice.core.base.BaseBO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
/**
*
* @ProjectName: long-night
* @PackageName: com.limbo.practice.base.entity.po
* @ClassName: SysUserPo
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author: limbo
* @Date: 2021-05-26 10:08:21
* @Modifier: limbo
* @ModifiedDate: 2021-05-26 10:08:21
*
* version V1.0
*/
@Getter
@Setter
@Accessors(chain = true)
public class SysUserPo extends BaseBO {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     * db_column: login_account
     */
    private java.lang.String loginAccount;

    /**
     * 登录密码
     * db_column: login_pass
     */
    private java.lang.String loginPass;

    /**
     * 密码盐
     * db_column: login_salt
     */
    private java.lang.String loginSalt;

    /**
     * 昵称
     * db_column: user_name
     */
    private java.lang.String userName;

    /**
     * 头像
     * db_column: user_head
     */
    private java.lang.String userHead;

    /**
     * 手机
     * db_column: user_phone
     */
    private java.lang.String userPhone;

    /**
     * 邮箱
     * db_column: user_email
     */
    private java.lang.String userEmail;

    /**
     * 性别 说明：1 表示男，0 表示女
     * db_column: user_sex
     */
    private java.lang.Boolean userSex;

    /**
     * 用户类型 说明：1 系统管理员 ，0 普通用户
     * db_column: user_type
     */
    private java.lang.Boolean userType;

    /**
     * 是否已锁定 说明：1 表示已锁定，0 表示未锁定
     * db_column: is_locked
     */
    private java.lang.Boolean locked;

    public SysUserPo(){
        super();
    }

    public SysUserPo(java.lang.Long id,java.lang.String loginAccount,java.lang.String loginPass,java.lang.String loginSalt,java.lang.String userName,java.lang.String userHead,java.lang.String userPhone,java.lang.String userEmail,java.lang.Boolean userSex,java.lang.Boolean userType,java.lang.Boolean locked,java.lang.Boolean deleted,java.util.Date gmtCreate,java.util.Date gmtModified){
        super(id, deleted, gmtCreate, gmtModified);
        this.loginAccount = loginAccount;
        this.loginPass = loginPass;
        this.loginSalt = loginSalt;
        this.userName = userName;
        this.userHead = userHead;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userSex = userSex;
        this.userType = userType;
        this.locked = locked;
    }

}
