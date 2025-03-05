package com.all.hibernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "laptop")
@Getter
@Setter
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "laptop_id")
	private int id;
	
	private String name;
	@OneToOne
	@JoinColumn(name = "Employee_id")
	private Employee employee;

}
