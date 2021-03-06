package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

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



    public interface Cart{//购物车中物品选中状态
        int CHECKED = 1;//购物车中 选中 状态
        int UN_CHECKED = 0;//购物车中 未选中 状态

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";//限制数量失败
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";//限制数量成功
    }

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public enum ProductStatusEnum{
        ON_SALE(1,"在线");
        private String value;
        private int code;

        ProductStatusEnum(int code,String value) {
            this.value = value;
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

    }
}
