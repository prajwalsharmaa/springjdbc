package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Jdbcconfig.class);

//		  JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//		  System.out.println("Jdbc Program Started");

		// fire query int result =
//		  template.update(query,456,"Prajwal Sharma","Bhairahawa");
//		  System.out.println("number of record inserted.."+result);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(107);
		student.setCity("Biratnagar");
		student.setName("New Student");
		// Insert
		int result = studentDao.insert(student);

		// Update
//		  int result = studentDao.change(student);
//		  
//		//Delete
//		  int result2 = studentDao.delete(34);
//		  
//		  System.out.println("student deleted "+ result2);
		// Select
		Student student1 = studentDao.getStudent(222);
		System.out.println(student1);

		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
