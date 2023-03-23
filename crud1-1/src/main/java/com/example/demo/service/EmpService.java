package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee1;


public interface EmpService {
	
	public void saveemp(Employee1 e);
	
	public List<Employee1> getEmp();
	
	public void deleteEmp(Integer id);

}
