package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeDao extends JpaRepository<Grade,Integer> {
}
