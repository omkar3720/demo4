package com.org.crud_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.crud_springboot.model.Employee;
import com.org.crud_springboot.servicei.EmployeeServiceI;

@RestController
public class EmployeeController
{

@Autowired
EmployeeServiceI esi;

@PostMapping("/saveEmployee")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e)
{
    Employee e1 = esi.saveEmployee(e);
    
    return new ResponseEntity<Employee>(e1,HttpStatus.CREATED);
}

@GetMapping("/getAllEmployee")
public ResponseEntity<List<Employee>> getAllEmployee()
{
	List<Employee> l = esi.getAllEmployee();
	
	return new ResponseEntity<List<Employee>>(l,HttpStatus.OK);
}
}
