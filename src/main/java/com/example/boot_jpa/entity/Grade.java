package com.example.boot_jpa.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Grade {
    @Id
    //IDENTITY：主键由数据库自动生成（主要是自动增长型）
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    //可以在one 方指定@OneToMany 注释并设置mappedBy 属性 以指定它是这一关联中的被维护端
    @OneToMany(mappedBy = "grade",fetch = FetchType.EAGER)
    private List<Student> students;
    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
