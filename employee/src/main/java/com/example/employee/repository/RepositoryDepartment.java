package com.example.employee.repository;

import com.example.employee.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryDepartment extends JpaRepository<employee,Long> {
}
