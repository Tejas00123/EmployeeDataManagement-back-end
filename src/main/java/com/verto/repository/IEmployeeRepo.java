package com.verto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verto.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
