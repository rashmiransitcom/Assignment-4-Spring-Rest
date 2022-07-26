package com.greatlearning.service;

import java.util.List;

import com.greatlearning.entity.Employee;
import com.greatlearning.entity.Role;
import com.greatlearning.entity.User;


public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchByFirstName(String firstName);
	
	public List<Employee> sortByFirstName(String order);
	
	public User saveUser(User user);
	
	public Role saveRole(Role role);
	
	public Employee findEmployeeById(int theId);

}