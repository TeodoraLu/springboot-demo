package com.spring.mapper;

import com.spring.entity.Io;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IoDao {
    int insert(Io record);

    int insertSelective(Io record);

    List<Io>  getAll();



}