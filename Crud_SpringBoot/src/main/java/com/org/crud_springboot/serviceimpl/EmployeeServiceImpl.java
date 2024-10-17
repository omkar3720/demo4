package com.org.crud_springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.crud_springboot.repoi.EmployeeRepositary;
import com.org.crud_springboot.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	EmployeeRepositary eri;
	
	
	
}
