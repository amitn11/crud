package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Employee1;
import com.example.demo.repository.EmpRepository;
import com.example.demo.service.EmpService;

@Service
public class EmpServiceImp implements EmpService {
	
	@Autowired
	private EmpRepository er;

	@Override
	public void saveemp(Employee1 e) {
		
		er.save(e);	
	}
	
	public List<Employee1> getEmp()
	{
		return er.findAll();
	}

	@Override
	public void deleteEmp(Integer id) {
		er.deleteById(id);
	}
	
	public Employee1 updateEmp(Integer id, Employee1 e)
	{
		Optional<Employee1> op=er.findById(id);
		if(op.isPresent())
		{
			Employee1 emp=op.get();
			emp.setFname(e.getFname());
			emp.setLname(e.getLname());
			emp.setMail(e.getMail());
			emp.setAge(e.getAge());
			return er.save(emp);
		}
		else
			return null;
	}

}
