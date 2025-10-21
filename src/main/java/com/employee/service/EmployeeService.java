package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.driver.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//POST addEmployee
	public String addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return "The Employee "+employee.getEmpName()+" of "+employee.getEmpDept()+" Department with Id: "+employee.getId()+" has been saved to the DB";
	}
	
	//GET getAllEmployees
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
	}
	
	//GET getAllMaleEmployees
	
	public List<Employee> getAllMaleEmployees(){
		
		return employeeRepository.findByEmpGender("M");
	
	}
	
	//GET getAllFemaleEmployees
	
	public List<Employee> getAllFemaleEmployees(){
		
		return employeeRepository.findByEmpGender("F");
	}
	
	//GET getAllEmployeesFromHRdept
	public List<Employee> getAllEmployeesFromHRdept(){
		
		return employeeRepository.findByEmpDept("HR");
	}
	
	//DELETE deleteEmployee
	public String deleteEmployee(int id) {
		
		if(employeeRepository.existsById(id)) {
			
			employeeRepository.deleteById(id);
		}
		
		return "The Employee of ID "+id+" data has been Deleted";
	}
	
	
	
	
	
	
}
