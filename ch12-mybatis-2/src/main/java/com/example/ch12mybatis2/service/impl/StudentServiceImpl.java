package com.example.ch12mybatis2.service.impl;

import com.example.ch12mybatis2.mapper.StudentMapper;
import com.example.ch12mybatis2.model.Student;
import com.example.ch12mybatis2.service.StudentService;
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
