package com.capgemini.inheritancesubclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritancesubclass.entity.ContractEmployee;
import com.capgemini.inheritancesubclass.entity.Employee;
import com.capgemini.inheritancesubclass.entity.RegularEmployee;
import com.capgemini.inheritancesubclass.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public Employee addEmployee() {

		Employee emp = new Employee(103, "akshata");
		service.addEmployee(emp);

		RegularEmployee regular = new RegularEmployee(1010, "aks", 55000, 2000);
		service.addEmployee(regular);

		ContractEmployee contract = new ContractEmployee(1020, "mahi", 20000, 48);
		service.addEmployee(contract);

		return regular;
	}

	@RequestMapping("/get")
	public Employee getEmployee() {
		return service.getEmployee(101);
	}

}
