package com.roshanjava.springboot.service;

import com.roshanjava.springboot.entity.Department;
import com.roshanjava.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    public DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> findDept() {
        return departmentRepository.findAll();
    }

    public Department finddeptByID(int id) {
        Department dept = departmentRepository.findById(id).orElse(null);
        return dept;
    }
}
