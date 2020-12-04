package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentDao extends JpaRepository<Student,String> {
}
