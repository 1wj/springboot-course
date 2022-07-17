package com.example.ch12mybatis.service.impl;

import com.example.ch12mybatis.mapper.StudentMapper;
import com.example.ch12mybatis.model.Student;
import com.example.ch12mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
