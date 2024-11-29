package com.springboot.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Emp;
import com.springboot.demo.service.EmpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping("/findall")
	public List<Emp> getAllEmp(){
		
		return empService.empAll();
	}
	
	@PostMapping("/create")
	public Emp createEmp(@RequestBody Emp emp) {
		return empService.saveEmpRecord(emp);
	}
	
	@GetMapping("/findBy/{id}")
	public Emp getMethodName(@PathVariable Long id) {
		Emp emp =  empService.getFindById(id);
		
		if (emp == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }
		return emp;
	}
	
	@DeleteMapping("/deleteBy/{id}")
	public String deleteByEmpId(@PathVariable Long id) {
		empService.deleteEmpRecord(id);
		 return "Deleted employee id - " + id;
	}
	
	@PutMapping("/update/{id}")
	public Emp updteEmp(@RequestBody Emp emp, @PathVariable Long id) {
		return empService.update(emp, id);

	}
	
	@DeleteMapping("/deleteAll")
	public String removeAll(){
		 empService.deleteAllEmpRecord();
		 return "deleted Successfully....!!!";
	}
		
}
