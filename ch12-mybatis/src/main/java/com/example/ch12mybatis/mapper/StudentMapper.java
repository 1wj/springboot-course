package com.example.ch12mybatis.mapper;

import com.example.ch12mybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper//相当于扫描Dao接口到spring容器中 就不需要写配置文件了MapperScanner那个
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}