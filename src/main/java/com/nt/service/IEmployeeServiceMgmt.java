package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeServiceMgmt {
	public Iterable<Employee> getAllEmployee();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeByNo(int no);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(int no);

}
