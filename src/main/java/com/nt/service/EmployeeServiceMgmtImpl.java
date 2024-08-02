package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;
@Service("service")
public class EmployeeServiceMgmtImpl implements IEmployeeServiceMgmt {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public Iterable<Employee> getAllEmployee() {
		
		 return empRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		
		return "saved employee by id::"+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int no) {
	Employee emp =  empRepo.findById(no).orElseThrow(()-> new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
	/* Optional<Employee> opt = empRepo.findById(emp.getEmpno());
	 if(opt.isEmpty())
	 {
		 empRepo.save(emp);
		 return emp.getEmpno()+"employee is updated";
	 }
		return emp.getEmpno()+"Employee is not updated";
		*/
		
		return "Employee is updated with id value::"+empRepo.save(emp).getEmpno();
	}
	
	
	
	@Override
	public String deleteEmployee(int no) {
	//repository
		empRepo.deleteById(no);
		
		return " Employee Deleted by id Record::"+no;
	}

}
