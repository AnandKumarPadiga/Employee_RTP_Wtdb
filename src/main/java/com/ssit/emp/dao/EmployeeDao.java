package com.ssit.emp.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.ssit.emp.model.Employee;

@Repository

public class EmployeeDao {
	
	private Map<Integer , Employee> employees;

	public EmployeeDao() {
		employees=new HashMap<>();
	
	
	}

	public List<Employee> getAllEmployees() {
		Collection<Employee> values=employees.values();
		return new ArrayList<>(values);
	}

	public Employee saveEmployee(Employee emp) {
		
		employees.put(emp.getEmpId(), emp);
		System.out.println("employee map "+employees);
		return employees.get(emp.getEmpId());
		
		
	}

	public Employee getEmployeeById(Integer empId) {
		Employee employee=employees.get(empId);
		return employee;
	}

	public void deleteEmployeeById(Integer empId) {
		employees.remove(empId);
		
	}

	public Employee updateEmployee(Integer empId, String newEmail) {
		Employee employee = employees.get(empId);
		employee.setEmail(newEmail);
		employees.put(employee.getEmpId(), employee);
		return employee;
		
	}
	

	
	
}
