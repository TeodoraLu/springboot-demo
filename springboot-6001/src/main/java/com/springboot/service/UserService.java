package com.springboot.service;


import com.springboot.entity.Iuser;

/**
 * @Description: 用户业务层接口
 */
public interface UserService {
    //核对用户名和密码
   Iuser checkUser(String name, String password);
}
