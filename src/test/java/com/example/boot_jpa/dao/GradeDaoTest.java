package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Grade;
import com.example.boot_jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class GradeDaoTest {


    @Autowired
    private GradeDao gradeDao;


    //查询班级下的所有学生
    @Test
    public void find(){

      Grade grade= gradeDao.findById(1).get();

        System.out.println(grade.toString());
       for (Student s:grade.getStudents()){
          System.out.println(s.toString());
      }

    }
}