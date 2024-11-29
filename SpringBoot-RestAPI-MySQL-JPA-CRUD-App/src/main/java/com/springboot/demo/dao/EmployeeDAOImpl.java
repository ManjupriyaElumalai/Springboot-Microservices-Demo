package com.springboot.demo.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.Entity.Employee;
import com.springboot.demo.repository.EmpRepo;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class); 
	@Autowired
	private EmpRepo empRepo; 

	@Override
	public Employee findById(long id) {
		try {
			
			Employee emp = empRepo.findById(id).get();
			return emp;
		}catch(Exception e){
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	@Override
	public void remove(long id) {
		try {
			Employee emp = new Employee();
			emp.setId(id);
			empRepo.delete(emp);
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	@Override
	public Employee add(Employee emp) {
		try {
			return empRepo.save(emp);
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
		return emp;
		
	}
	
	@Override
	public void update(long id, Employee emp) {
		try {
			emp.setId(id);
			empRepo.save(emp);
			
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
		
	}

	@Override
	public List<Employee> findAll() {
		try {
			return empRepo.findAll();
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	

}
