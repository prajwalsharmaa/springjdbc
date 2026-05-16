package com.spring.jdbc.daopractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Employee;
@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Employee employee) {
		String query = "insert into employee (id,name,salary) values(?,?,?)";
		int result = jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getSalary());
		System.out.println("Employee1");
		return result;
	}

	@Override
	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int change(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
