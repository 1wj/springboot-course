package com.example.ch16transaction.web;




import com.example.ch16transaction.model.Student;
import com.example.ch16transaction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("student")
    public @ResponseBody Object student(Integer id,String name){//一般转换成json格式会用到它
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        int updateCount=studentService.updateStudentById(student);
        return "修改学生编号为"+id+"的姓名修改结果"+updateCount;
    }
}
