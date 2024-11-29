package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.Entity.Employee;
import com.springboot.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/empall")
	public List<Employee> getAllEmployee(){
		return employeeService.findAll();
	}
	
	@PostMapping("/save")
	public void saveEmpData(@RequestBody Employee emp) {
		employeeService.add(emp);
	}
	
	
}
