package com.all.hibernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees_data")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50,nullable = false)
	private String name;
	
	@Column(length = 50,nullable = false)
	private String designation;
	
	@Column(length = 50,nullable = false)
	private Long salary;
	@Lob
	private String about;
	
	@OneToOne(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
	private Laptop laptop;
	
	public Employee(String name, String designation, Long salary, String about) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.about = about;
	}
	
	
	

}
