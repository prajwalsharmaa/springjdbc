package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public  class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	//Insert operation
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	//Update operation
	
	public int change(Student student) {
		//updating data.
		String query = "update student set name = ?,city =? where id =?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	//Delete operation
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}
	
	//Select operation
	public Student getStudent(int studentId) {
		
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	
	

	
}