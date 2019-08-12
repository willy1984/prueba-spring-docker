package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.model.EmployeeModel;
import com.crud.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Lista de empleados
	public List<EmployeeModel> getAllEmployees(){
		return this.employeeRepository.findAll();
	}

}
