package com.example.ch02.web;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ch02.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

//@Repository
public interface UserMapper extends BaseMapper<Student> {

}
