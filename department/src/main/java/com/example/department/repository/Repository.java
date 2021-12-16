package com.example.department.repository;

import com.example.department.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<department,Long> {
}
