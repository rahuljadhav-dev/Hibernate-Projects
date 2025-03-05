package com.all.hibernate;

import com.all.hibernate.crud.CrudOperations;
import com.all.hibernate.entity.Employee;
import com.all.hibernate.entity.Laptop;

public class PerformCrudOperations {
	public static void main(String[] args) {
		//for insert the employee
		Employee employee=new Employee(null, null, null, null);
		Laptop laptop=new Laptop();
		laptop.setEmployee(employee);
		employee.setLaptop(laptop);

		System.out.println(CrudOperations.insertEmployee(employee));


		//for get the employee by id
		CrudOperations.getEmployeeByID(0);

		//for get the employee by name
		CrudOperations.getEmployeeByName("");
		
		//for delete the employee
		System.out.println(CrudOperations.deleteEmployeeByID(0));
		
		//for get all employees
		CrudOperations.getAllEmployees();
		
		//for update the employee
		CrudOperations.updateEmployeeById(0, employee);



	}

}
