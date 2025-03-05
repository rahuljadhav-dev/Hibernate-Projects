package com.hibernate.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Data")
public class Employee {
	@Id()
	@Column(name="ID")
	public int id;
	@Column(name="Ename")
	public String name;
	@Column(name="Eage")
	public int age;
	@Column(name="Designation")
	public String desig;
	
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desig=" + desig + ", salary=" + salary
//				+ "]";
//	}


	public Employee() {
		super();
	}


	public Employee(int id, String name, int age, String desig, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desig = desig;
		this.salary = salary;
	}


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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	public long salary;

}
