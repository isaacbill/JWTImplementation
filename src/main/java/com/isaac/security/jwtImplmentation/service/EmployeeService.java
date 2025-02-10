package com.isaac.security.jwtImplmentation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isaac.security.jwtImplmentation.model.Employee;
import com.isaac.security.jwtImplmentation.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    // Update employee
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setRole(updatedEmployee.getRole());
            return employeeRepository.save(employee);
        }).orElse(null);
    }

    // Delete employee
    public boolean deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
