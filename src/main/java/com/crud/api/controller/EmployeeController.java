package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.model.EmployeeModel;
import com.crud.api.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//Metodo para traer la lista de empleados
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<EmployeeModel>getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
