package com.hibernate.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DataH")
public class ProjectH {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Names")
	private String name;
	@Column(name="Designation")
	private String desig;
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
	public ProjectH(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}
//	public ProjectH() {
//		super();
//	}
	@Override
	public String toString() {
		return "ProjectH [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
	
	
	

}
