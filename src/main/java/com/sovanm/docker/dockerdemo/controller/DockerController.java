package com.sovanm.docker.dockerdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/name")
	public String getMyName() {

		return "Simple Spring Boot Application";
	}

	@GetMapping("/employees2")
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}

	@GetMapping("/employees")
	@Async
	public List<Employee> getEmployeesNative() {

		return (List<Employee>) employeeRepository.findAllEmployees();
	}
}
