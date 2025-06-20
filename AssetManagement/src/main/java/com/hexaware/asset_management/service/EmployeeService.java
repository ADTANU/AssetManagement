package com.hexaware.asset_management.service;

import java.util.List;

import com.hexaware.asset_management.model.Employee;

public interface EmployeeService {
    String addEmployee(Employee employee);
    String updateEmployee(Employee employee);
    String deleteEmployee(int employeeId);
    List<Employee> getAllEmployees();
    Employee searchEmployeeById(int employeeId);
    Employee searchEmployeeByUserName(String userName);
}