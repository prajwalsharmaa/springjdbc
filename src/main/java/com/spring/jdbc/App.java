package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		/*
		 * JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		 * System.out.println("Jdbc Program Started");
		 * 
		 * //Insert Query, String query =
		 * "insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //fire query int result =
		 * template.update(query,456,"Prajwal Sharma","Bhairahawa");
		 * System.out.println("number of record inserted.."+result);
		 */
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
        student.setId(374);
        student.setCity("Biratnagar");
        student.setName("Updated Magar");
        
        int result = studentDao.change(student);
        System.out.println("student added"+ result);
    }
}
