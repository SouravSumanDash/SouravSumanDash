package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.dbaccess.EmployeeDbAccess;
import com.example.demoproject.model.Employee;

@RestController
public class EmployeeApiController {
	@Autowired
	public EmployeeDbAccess dbaccess;
	
	@GetMapping("/getallemployees")
	public List<Employee> getallemployees() {
		return dbaccess.getAllEmployees();
	}
}
