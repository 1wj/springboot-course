package com.example.ch27java2;

import com.example.ch27java2.sersvice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//启动方法二  实现commandlineRunner 重写方法
@SpringBootApplication
public class Ch27Java2Application implements CommandLineRunner {

    @Autowired
    private  StudentService studentService;

    public static void main(String[] args) {
        //springboot启动程序，会初始化spring容器
      SpringApplication.run(Ch27Java2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //调用业务方法
        String s = studentService.sayHello("方式二");
        System.out.println(s);

    }
}
