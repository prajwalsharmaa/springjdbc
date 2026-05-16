package com.spring.jdbc.daopractice;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public int delete(Employee employee);
	public int change(Employee employee);
	
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
}
