package com.org.crud_springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.crud_springboot.model.Employee;
import com.org.crud_springboot.repoi.EmployeeRepositary;
import com.org.crud_springboot.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	EmployeeRepositary eri;

	@Override
	public Employee saveEmployee(Employee e) 
	{
		Employee e1 = eri.save(e); 
		return e1;
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		List<Employee> l = eri.findAll();
		return l;
	}
	
	
	
}
