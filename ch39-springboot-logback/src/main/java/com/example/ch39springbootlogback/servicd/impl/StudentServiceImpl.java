package com.example.ch39springbootlogback.servicd.impl;

import com.example.ch39springbootlogback.mapper.StudentMapper;
import com.example.ch39springbootlogback.servicd.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
