package com.iweb.ch52springbootprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iweb.ch51springbootinterface.model.Student;
import com.iweb.ch51springbootinterface.service.StudentService;
import com.iweb.ch52springbootprovider.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
