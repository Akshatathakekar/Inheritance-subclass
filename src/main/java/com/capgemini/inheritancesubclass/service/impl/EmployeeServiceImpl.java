package com.capgemini.inheritancesubclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritancesubclass.dao.EmployeeDao;
import com.capgemini.inheritancesubclass.entity.Employee;
import com.capgemini.inheritancesubclass.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee employee) {

		
		return dao.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {

		return dao.findById(id).get();
	}

}
