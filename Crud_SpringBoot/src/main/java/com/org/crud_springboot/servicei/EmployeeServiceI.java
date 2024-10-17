package com.org.crud_springboot.servicei;

import java.util.List;

import com.org.crud_springboot.model.Employee;

public interface EmployeeServiceI {

	public Employee saveEmployee(Employee e);

	public List<Employee> getAllEmployee();

}
