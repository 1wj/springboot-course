package com.example.ch16transaction;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ch16transaction.mapper")
//以前还需要加个  @EnableTransactionManagement  //开启事务（可选）
public class Ch16TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch16TransactionApplication.class, args);
    }

}
