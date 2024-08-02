package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeServiceMgmt;

import jakarta.persistence.SequenceGenerator;
import jakarta.servlet.http.HttpSession;


@Controller
public class EmployeeOperationController {
	//inject service class
	@Autowired
	private IEmployeeServiceMgmt empservice;
	//home page 
	@GetMapping("/")
	public String showHome()
	{
		return "home_page";
	}
	
	//all employee details jsp page
	@GetMapping("report")
	public String getEmployee(Map<String,Object> map)
	{
		//use service
	Iterable<Employee> itlist = empservice.getAllEmployee();
	System.out.println(itlist);
	//put result in model attribute
	map.put("emplist", itlist);
	//LVN(logical view name)
	return "show_employee_report";
		
	}
	
	@GetMapping("/register")
	public String showFormSaveEmployee(@ModelAttribute("emp") Employee emp)
	{
		return "employee_register";
	}
	/*
	@PostMapping("/register")
	public String processRegisterEmployeeForm( Map<String,Object> map,
												@ModelAttribute("emp") Employee emp) {
		
	String msg = empservice.registerEmployee(emp);
	Iterable<Employee> itlist=empservice.getAllEmployee();
	map.put("resultMsg", msg);
	map.put("emplist", itlist);
		return "show_employee_report";
		}*/
	
	
	@PostMapping("/register") //PRG--> pattern solve the double posting problem +Session attribute 
	public String processRegisterEmployeeForm( HttpSession ses,
												@ModelAttribute("emp") Employee emp) {
		//use service class
	String msg = empservice.registerEmployee(emp);
	//keep the result model attribute
	ses.setAttribute("resultMsg", msg);
		//LVN
		return "redirect:report";
		}
	
	
	@GetMapping("/emp_edit")
	public String showEditFormPage (@RequestParam int no,
									@ModelAttribute("emp") Employee emp) {
		
		//use service
	Employee emp1 = empservice.getEmployeeByNo(no);
	
	System.out.println(emp1.toString());
	//keep 
	BeanUtils.copyProperties(emp, emp1);
	return "employee_edit";
		
	}
	
	@PostMapping("/emp_edit")
	public String processEditFormPage ( RedirectAttributes attrs,
									@ModelAttribute("emp") Employee emp) {
		
		//use service
	String msg= empservice.updateEmployee(emp);
	//keep 
	attrs.addFlashAttribute("resultMsg", msg);
	
	//return LVN
	return "redirect:report";
		
	}
	
//	@ExceptionHandler(MissingServletRequestParameterException.class)
	@GetMapping("/emp_delete")
	public String processDeleteFormPage ( HttpSession ses,
										@RequestParam int no ){
		
		//use service
	String msg= empservice.deleteEmployee(no);
	//keep 
	ses.setAttribute("resultMsg", msg);
	//return LVN
	return "redirect:report";
		
	}

	
	
	

}
