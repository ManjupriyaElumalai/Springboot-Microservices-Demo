package com.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Emp;
import com.springboot.demo.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;
	public List<Emp> empAll() {
		return empRepository.findAll();
	}
	
	public Emp saveEmpRecord(Emp emp) {
		return empRepository.save(emp);
	}
	
	public Emp getFindById(Long id) {
		Optional<Emp> emp = empRepository.findById(id);
		Emp employee = null;
		if(emp.isPresent()) {
			employee = emp.get();
		}
		else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + id);
        }
		return employee;
	}
	
	public void deleteEmpRecord(Long id) {
		
		Optional<Emp> emp = empRepository.findById(id);
		Emp employee = null;
		if(emp.isPresent()) {
			employee = emp.get();
		}
		else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + id);
        }
		
		empRepository.delete(employee);
	}

	public Emp update(Emp emp, Long id) {
		Optional<Emp> existingEmployee = empRepository.findById(id);
		
        if (existingEmployee == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }else {
        	// Update the employee's fields
            existingEmployee.get().setFirstName(emp.getFirstName());
            existingEmployee.get().setLastName(emp.getLastName());
            existingEmployee.get().setEmailId(emp.getEmailId());
        }

        // Save the updated employee
        return empRepository.save(emp);
        
	}

	public void deleteAllEmpRecord() {
		
		 empRepository.deleteAll();
	}

}
