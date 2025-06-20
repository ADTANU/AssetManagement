package com.hexaware.asset_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.asset_management.model.Employee;
import com.hexaware.asset_management.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully";
    }

    @Override
    public String updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee updated successfully";
    }

    @Override
    public String deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Employee deleted successfully";
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee searchEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee searchEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }

}