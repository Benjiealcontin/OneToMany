package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Model.Department;
import com.example.Service.Request;

public interface DepartmentRespo extends JpaRepository<Department, Integer> {



}
