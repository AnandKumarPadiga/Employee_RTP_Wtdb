package com.ssit.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssit.emp.dao.EmployeeDao;
import com.ssit.emp.model.Employee;

@Service

public class EmployeeService {
	
	@Autowired
	
	private EmployeeDao empDao;

	public List<Employee> getAllEmployees() {
		
		List<Employee> employees=empDao.getAllEmployees();
		return employees;
		
		
	}

	public Employee createEmployee(Employee emp) {
	Employee emp1=empDao.saveEmployee(emp);
	return emp1;
		
		
	}

	public Employee getEmployeeById(Integer empId) {
		Employee emp=empDao.getEmployeeById(empId);
		
		return emp;
	}

	public void deleteEmployeeById(Integer empId) {
		empDao.deleteEmployeeById(empId);
		
	}

	public Employee updateEmployee(Integer empId, String newEmail) {
		Employee updateEmployee=empDao.updateEmployee(empId,newEmail);
		return updateEmployee;
	}

}
