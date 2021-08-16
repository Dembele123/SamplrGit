package com.roshanjava.springboot.controller;

import com.roshanjava.springboot.entity.Department;
import com.roshanjava.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class departmentController {

    @Autowired
    public DepartmentService departmentService;

    @PostMapping("/s")
    public Department saveDepartment (@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/s")
    public List<Department> viewDept(){
        List<Department> dept = departmentService.findDept();
        return dept;
    }
    @GetMapping("/s/{id}")
    public Department getbyID(@PathVariable("id")int id){
        Department dept = departmentService.finddeptByID(id);
        return dept;
    }


}
