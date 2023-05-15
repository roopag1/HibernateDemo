package com.Hibernate;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipment {

	@Id
	int eqid;
	String name;
	/*
	 * @ManyToOne Employee employee;
	 */
	
	@ManyToMany
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getEqid() {
		return eqid;
	}
	public void setEqid(int eqid) {
		this.eqid = eqid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public Employee getEmployee() { return employee; } public void
	 * setEmployee(Employee employee) { this.employee = employee; }
	 */
	
	
}
