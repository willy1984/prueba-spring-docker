package com.techprimers.jpa.springdatajpahibernateexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techprimers.jpa.springdatajpahibernateexample.model.EmployeeModel;
import com.techprimers.jpa.springdatajpahibernateexample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Lista de empleados
	public List<EmployeeModel>getAllEmployees(){
		return this.employeeRepository.findAll();
	}
}
