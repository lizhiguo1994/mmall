package com.mmall.common;

/**
 * Created by Administrator on 2018/5/24.
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";//当前用户

    public static final String EMAIL = "email";//邮箱

    public static final String USERNAME = "username";//用户名

    public interface Role{//用户权限组
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
