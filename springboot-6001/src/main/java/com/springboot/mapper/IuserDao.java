package com.springboot.mapper;

import com.springboot.entity.Iuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper//Mybatis注解，Mybatis需要找到对应的 mapper，在编译的时候动态生成代理类，实现数据库查询功能
@Repository//spring注解，将数据访问层 (DAO层) 的类标识为 Spring Bean
public interface IuserDao {

    Iuser findByUsernameAndPassword(@Param("name")  String  name,@Param("password") String password );
}