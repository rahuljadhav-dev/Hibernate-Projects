package com.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DataTable")
public class Employee {
	@Id
	@Column(name="EID")
	private int id;
	
	@Column(name="EName")
	private String name;
	
	@Column(name="EDesignation")
	private String desig;
	
	@Column(name="ESalary")
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String desig, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
