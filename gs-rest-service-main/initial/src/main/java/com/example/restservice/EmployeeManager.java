package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final Employees employees;

    public EmployeeManager() {
        // Initialize Employees class and hard-code example employees
        List<Employee> exampleEmployees = new ArrayList<>();
        exampleEmployees.add(new Employee("1", "Sandesh", "Bhujbal", "sandeshbhujbal30@email.com", "Manager"));
        exampleEmployees.add(new Employee("2", "Omkar", "Pawar", "omkarpawar.45@email.com", "Developer"));
        exampleEmployees.add(new Employee("3", "Sanket", "Tamhane", "sanket10.tamhane@email.com", "Designer"));

        employees = new Employees();
        employees.setEmployeeList(exampleEmployees);
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        List<Employee> employeeList = employees.getEmployeeList();
        employeeList.add(employee);
        employees.setEmployeeList(employeeList);
    }


}

