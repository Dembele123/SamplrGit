package com.roshanjava.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {


    private String departmentName;

    private String departmentCode;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    //ki variable declare garda
    //ki ta getters


}
