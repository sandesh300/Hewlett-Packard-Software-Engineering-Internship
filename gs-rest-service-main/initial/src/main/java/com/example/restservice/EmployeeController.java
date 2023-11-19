package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return "Employee added successfully!";
    }
}
