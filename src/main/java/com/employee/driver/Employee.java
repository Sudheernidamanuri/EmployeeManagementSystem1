package com.employee.driver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;
	private String empDept;
	private String empGender;
	
	public Employee() {
		
	}

	public Employee(int id, String empName, String empDept, String empGender) {
		
		this.id = id;
		this.empName = empName;
		this.empDept = empDept;
		this.empGender = empGender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empDept=" + empDept + ", empGender=" + empGender
				+ "]";
	}
	
	
	
	
	
}
