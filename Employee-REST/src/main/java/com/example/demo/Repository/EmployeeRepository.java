package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
