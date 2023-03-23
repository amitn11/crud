package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee1;
import com.example.demo.serviceImp.EmpServiceImp;

@CrossOrigin("*")
@RestController
@RequestMapping("/api1")
public class EmpController {
	
	@Autowired
	private EmpServiceImp ser;
	
	@PostMapping("/save1")
	public void saveemp1(@RequestBody Employee1 e)
	{
		ser.saveemp(e);
	}
	
	@GetMapping("/get")
	public List<Employee1> getEmp()
	{
		List<Employee1> list=ser.getEmp();
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable Integer id)
	{
		ser.deleteEmp(id);
	}
	
	@PutMapping ("/update/{id}")
	public Employee1 updateEmp(@PathVariable Integer id, @RequestBody Employee1 emp)
	{
		Employee1 e= ser.updateEmp(id, emp);
		return emp;
	}

}
