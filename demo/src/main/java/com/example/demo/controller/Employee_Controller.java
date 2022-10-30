package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.service.Employee_Service;

public class Employee_Controller {
@Autowired

	private Employee_Service service;
	
	public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp1){ 
		return new ResponseEntity<Employee>(service.saveOrUpdate(emp1), HttpStatus.ACCEPTED);
	}
}
