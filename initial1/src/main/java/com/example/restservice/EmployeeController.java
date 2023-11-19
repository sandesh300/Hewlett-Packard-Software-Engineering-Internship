package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.Employee;
import com.example.restservice.EmployeeManager;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public Employees getAllEmployees() {
        // Return all user data
        return employeeManager.getEmployees();
    }
}
