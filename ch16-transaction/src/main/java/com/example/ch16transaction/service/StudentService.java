package com.example.ch16transaction.service;


import com.example.ch16transaction.model.Student;

public interface StudentService {

    Student queryStudentById(Integer id);

    int updateStudentById(Student student);
}
