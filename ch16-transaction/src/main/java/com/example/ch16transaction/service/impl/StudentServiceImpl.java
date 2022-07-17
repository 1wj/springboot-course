package com.example.ch16transaction.service.impl;


import com.example.ch16transaction.mapper.StudentMapper;
import com.example.ch16transaction.model.Student;
import com.example.ch16transaction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int updateStudentById(Student student) {

        //修改成功
        int i = studentMapper.updateByPrimaryKey(student);

        //失败
        int a=10/0;
        return i;

    }
}
