package com.example.demoproject.dbaccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demoproject.model.Employee;

@Repository
public class EmployeeDbAccess {
	@Autowired
    JdbcTemplate jdbcTemplate;
	public List<Employee> getAllEmployees() {
	    String sql = "select a.empno, a.name,a.job,b.name as \"DEPT\" from employees a, departments b where a.deptno=b.deptno";
	     
	    List<Employee> employees = jdbcTemplate.query(sql,
	                BeanPropertyRowMapper.newInstance(Employee.class));
	    //System.out.println(employees.size());
	    return employees;
	}
}
