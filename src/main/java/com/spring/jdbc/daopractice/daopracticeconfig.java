/*
 * package com.spring.jdbc.daopractice;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource;
 * 
 * @Configuration
 * 
 * @ComponentScan(basePackages = {"com.spring.jdbc.daopractice"}) public class
 * daopracticeconfig {
 * 
 * @Bean public DataSource getDS() { DriverManagerDataSource DS = new
 * DriverManagerDataSource(); DS.setDriverClassName("com.mysql.cj.jdbc.Driver");
 * DS.setUrl("jdbc:mysql://localhost:3306/springjdbc"); DS.setUsername("root");
 * DS.setPassword("admin"); return DS; } }
 */