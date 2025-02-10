package com.isaac.security.jwtImplmentation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaac.security.jwtImplmentation.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

}
