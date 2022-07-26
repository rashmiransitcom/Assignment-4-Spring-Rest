package com.greatlearning.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findAllByOrderByFirstNameAsc();

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameDesc();

}
