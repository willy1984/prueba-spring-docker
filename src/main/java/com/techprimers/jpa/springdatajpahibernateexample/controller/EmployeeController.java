package com.techprimers.jpa.springdatajpahibernateexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springdatajpahibernateexample.model.EmployeeModel;
import com.techprimers.jpa.springdatajpahibernateexample.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//Metodo buscar empleados
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<EmployeeModel> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
