package com.springboot.demo.dao;

import java.util.List;

import com.springboot.demo.Entity.Employee;

public interface EmployeeDAO {

	public Employee findById(long id);
	public void remove(long id);
	public Employee add(Employee emp);
	public void update(long id, Employee emp);
	public List<Employee> findAll();
}
