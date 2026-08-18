package com.practice.beginner.repository;

import com.practice.beginner.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department, String> {

}
