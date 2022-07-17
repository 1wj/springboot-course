package com.example.ch24ssmprovider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.ch24ssmprovider.mapper.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass =StudentService.class,version ="2.0.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public Integer queryAllStudentCount() {
        //先去Redis缓存中查询，如果有，：直接使用，如果没有，取数据库查询并放到Redis缓存中
        Integer allStudentCount= (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if(null==allStudentCount){
            allStudentCount=studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount",allStudentCount);
            System.out.println(redisTemplate.opsForValue().get("allStudentCount")+"-->这是设置的值");

        }
        System.out.println(redisTemplate.opsForValue().get("allStudentCount")+"-->这是设置的值2");

        return allStudentCount;
    }
}
