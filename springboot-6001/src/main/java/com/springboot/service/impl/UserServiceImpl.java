package com.springboot.service.impl;


import com.springboot.entity.Iuser;
import com.springboot.mapper.IuserDao;
import com.springboot.service.UserService;
import com.springboot.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired  //spring可以自动帮你把bean里面引用的对象的setter/getter方法省略，它会自动帮你set/get
    private IuserDao iuserDao;

    /**
     * @Param: name:用户名；password:密码
     * @Return: 返回用户对象
     */
    @Override
    public Iuser checkUser(String name, String password) {
        Iuser iuser = iuserDao.findByUsernameAndPassword(name, MD5Utils.code(password));
        return iuser;
    }
}