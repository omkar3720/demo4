package com.org.crud_springboot.repoi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.crud_springboot.model.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer>{

}
