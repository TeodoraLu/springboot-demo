package com.springboot.mapper;

import com.springboot.entity.Iuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IuserDao {


    Iuser findByUsernameAndPassword(@Param("name")  String  name,@Param("password") String password );
}