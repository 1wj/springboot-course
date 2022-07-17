package com.example.ch02;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ch02.web.UserMapper;
import lombok.Data;
import org.apache.catalina.User;
import org.apache.catalina.Wrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Ch02ApplicationTests {

    @Autowired
    UserMapper userMapper;  //这个爆红可以不加理会

    @Test
    void contextLoads() {
        List<Student> students = userMapper.selectList(null);
        System.out.println(students);
    }

    @Test
    void insert() {
        Student student=new Student();
        student.setAge(188);
        student.setName("dfs");
        int insert = userMapper.insert(student);
        System.out.println(insert);
    }

    @Test
    void update() {
        Student student=new Student();
        student.setAge(28);
        student.setId(11);

        int update = userMapper.updateById(student);
        System.out.println(update);
    }

    //乐观锁
    @Test
    void OptimisticLocker() {

        //必须先查
        Student student = userMapper.selectById(11);

        //然后再改
        student.setAge(38);
        int update = userMapper.updateById(student);
        System.out.println(update);
    }

    //批量查询id
    @Test
    void selectBatch() {

        //必须先查
        List<Student> students = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));

        System.out.println(students);
    }

    //分页
    @Test
    void page() {
        //当前页，每页记录数
        Page<Student> page=new Page<>(1,5);
        userMapper.selectPage(page,null);

        System.out.println(page.getCurrent());//当前页

        System.out.println(page.getRecords());//每页数据list集合

        System.out.println(page.getPages());//每页显示记录数
        System.out.println(page.getSize());//总记录数
        System.out.println(page.getTotal());//总页数

        System.out.println(page.hasNext());//上一页
        System.out.println(page.hasPrevious());//下一页
    }

    //wrapper
    @Test
    void wrapper() {

        QueryWrapper<Student> wrapper= new QueryWrapper<>();
        wrapper.ge("age",30); //大于等于  字段名称  参数值
        List<Student> students = userMapper.selectList(wrapper);
        System.out.println(students);

    }


}
