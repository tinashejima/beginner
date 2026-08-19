package com.practice.beginner.service;

import com.practice.beginner.entity.Department;
import com.practice.beginner.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements GenericService<Department, String> {

    private final DepartmentRepository departmentRepository;

    public DepartmentService (DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public Optional<Department> getById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findMany() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        departmentRepository.deleteById(id);

    }

    @Override
    public void update(Department department, String id) {
        if(departmentRepository.existsById(id));

    }
}
