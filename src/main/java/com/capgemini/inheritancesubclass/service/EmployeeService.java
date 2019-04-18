package com.capgemini.inheritancesubclass.service;

import com.capgemini.inheritancesubclass.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public Employee getEmployee(int id);
}
