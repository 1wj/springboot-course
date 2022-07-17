package com.example.ch26java1;

import com.example.ch26java1.sersvice.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ch26Java1Application {

    public static void main(String[] args) {
        /*
            springboot程序启动后，返回值是ConfigurableApplicationContext,它也是一个spring容器
            它其实相当于原来spring容器中启动容器ClassPathXmlApplicationContext
         */
        //获取springboot容器   //run方法拿到的就是springboot容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Ch26Java1Application.class, args);
        StudentService studentService= (StudentService) applicationContext.getBean("studentServiceImpl");
        //调用业务方法
        String s = studentService.sayHello();
        System.out.println(s);
    }

}
