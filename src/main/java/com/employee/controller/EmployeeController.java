package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.driver.Employee;
import com.employee.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		
		this.employeeService = employeeService;
	}

    @PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		
		return employeeService.addEmployee(employee);
	}
    
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
    	
    	return employeeService.getAllEmployees();
    }
    
    @GetMapping("/getAllMaleEmployees")
    public List<Employee> getAllMaleEmployees(){
    	
    	return employeeService.getAllMaleEmployees();
    }
    
    @GetMapping("/getAllFemaleEmployees")
    public List<Employee> getAllFemaleEmployees(){
    	
    	return employeeService.getAllFemaleEmployees();
    }
    
    @GetMapping("/getAllEmployeesFromHRdept")
    public List<Employee> getAllEmployeesFromHRdept(){
    	
    	return employeeService.getAllEmployeesFromHRdept();
    }
    
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
    	
    	return employeeService.deleteEmployee(id);
    }

}
