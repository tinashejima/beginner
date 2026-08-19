package com.practice.beginner.controller;


import com.practice.beginner.entity.Department;
import com.practice.beginner.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/department")
public class DepartmentResource {
    private final DepartmentService departmentService;

    public DepartmentResource(DepartmentService departmentService){
        this.departmentService = departmentService;

    }

    @PostMapping()
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }
}
