package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Grade;
import com.example.boot_jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


//多对一
@SpringBootTest
class StudentDaoTest {


    @Autowired
    private StudentDao studentDao;
    @Autowired
    private GradeDao gradeDao;

    @Test
    void find() {
        Student student = studentDao.findById("a").get();
        System.out.println(student.toString());

    }


    @Test
    void add(){
        Student student=new Student();
        Grade grade=new Grade();
        grade.setId(1);
        student.setGrade(grade);
        student.setSid("ccc");
        student.setSname("赵a");
        studentDao.save(student);
    }
}