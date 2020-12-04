package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,String> {
}
