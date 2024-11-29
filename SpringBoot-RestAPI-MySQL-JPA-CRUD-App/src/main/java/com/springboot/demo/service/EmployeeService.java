package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.Entity.Employee;

public interface EmployeeService {

	 Employee findById(long id);
	 void remove(long id);
	 void add(Employee emp);
	 void update(long id, Employee emp);
	 List<Employee> findAll();
}
