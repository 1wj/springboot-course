package com.example.ch12mybatis2.mapper;

import com.example.ch12mybatis2.model.Student;
import org.apache.ibatis.annotations.Mapper;

//@Mapper  不在这加了换个写法
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}