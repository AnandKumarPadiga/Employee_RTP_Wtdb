package com.ssit.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssit.emp.model.Employee;
import com.ssit.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
	@Autowired
	
	private EmployeeService empService; 
	
	@GetMapping

	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = empService.getAllEmployees();
		
		
		return employees;
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("Employee Object "+emp);
		Employee emp1=empService.createEmployee(emp);
		return emp1;
		
	}
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Integer empId) {
		Employee emp= empService.getEmployeeById(empId);
		return emp;
	}
	
	@PutMapping("/{empId}/{newemail}")
	public Employee updateEmployee(@PathVariable("empId")Integer empId,@PathVariable("newemail")String newEmail) {
		Employee emp=empService.updateEmployee(empId,newEmail);
		return emp;
	}
	
	
	@DeleteMapping("/{empId}")
	public void deleteEmployeeById(@PathVariable("empId") Integer empId) {
		
		empService.deleteEmployeeById(empId);
		
	

	}
	
}
