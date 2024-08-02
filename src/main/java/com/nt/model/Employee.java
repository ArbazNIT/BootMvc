package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_id_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	private String empName;
	private String job ="CLERK";
	private Double salary;
	
	public Employee(Integer empno, String empName, String job, Double salary) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
	}

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	//setter and getter
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//toString
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	

}
