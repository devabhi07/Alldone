package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employee_Repo;

public class Employee_Service {
@Autowired

	private Employee_Repo employee;

	public Employee saveOrUpdate(Employee emp){
		return employee.save(emp);
	}
	
}
