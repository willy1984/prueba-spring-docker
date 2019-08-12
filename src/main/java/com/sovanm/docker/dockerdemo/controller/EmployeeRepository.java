package com.sovanm.docker.dockerdemo.controller;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sovanm.docker.dockerdemo.controller.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query(nativeQuery = true, value="SELECT * FROM SalesLT.Employees")
	Collection<Employee> findAllEmployees();

}