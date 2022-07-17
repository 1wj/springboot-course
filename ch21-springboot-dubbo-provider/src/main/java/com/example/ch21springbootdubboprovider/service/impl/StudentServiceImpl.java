package com.example.ch21springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.StudentService;
import org.springframework.stereotype.Component;

@Component

//dubbo:service interface="" version="" timeout=""
@Service(interfaceClass = StudentService.class,version = "1.0.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        return 120005;
    }
}
