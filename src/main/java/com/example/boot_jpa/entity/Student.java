package com.example.boot_jpa.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    //这边的id不是自增的 需要我们程序来维护 所以是默认值
    private String sid;
    private String sname;
    @Transient
    private  Integer gid;


    //维护方
    @ManyToOne(targetEntity = Grade.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "gid")
    private Grade grade;





}
