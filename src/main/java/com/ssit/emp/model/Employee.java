package com.ssit.emp.model;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String email;
	private String mobilenumber;
	//setters & getters
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Employee(Integer empId, String empName, String email, String mobilenumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", mobilenumber="
				+ mobilenumber + "]";
	}
	
	
	
}
