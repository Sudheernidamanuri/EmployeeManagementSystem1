package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.driver.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {

	List<Employee> findByEmpGender(String empGender);
	List<Employee> findByEmpDept(String empDept);
}
