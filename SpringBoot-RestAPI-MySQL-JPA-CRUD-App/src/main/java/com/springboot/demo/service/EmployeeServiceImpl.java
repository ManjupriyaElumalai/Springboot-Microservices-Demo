package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.Entity.Employee;
import com.springboot.demo.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	@Override
	public Employee findById(long id) {
		if(id <= 0) {
			throw new IllegalArgumentException("ID cannot be 0 or < 0");
		}
		return employeeDAO.findById(id);
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		if(id <= 0) {
			throw new IllegalArgumentException("ID cannot be 0 or < 0");
		}
		employeeDAO.remove(id);
	}

	@Override
	public void add(Employee emp) {
		if(emp == null) {
			throw new IllegalArgumentException("The passed object cannot ");
		}
		employeeDAO.add(emp);
	}

	@Override
	public void update(long id, Employee emp) {
		if(emp == null) {
			throw new IllegalArgumentException("The passed object cannot ");
		}
		employeeDAO.update(id, emp);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> emp = employeeDAO.findAll();
		if(emp.size() > 0) {
			return emp;
		}
		return null;
	}

}
