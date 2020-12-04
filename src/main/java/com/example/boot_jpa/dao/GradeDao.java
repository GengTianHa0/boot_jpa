package com.example.boot_jpa.dao;

import com.example.boot_jpa.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface GradeDao extends JpaRepository<Grade,Integer> {
}
