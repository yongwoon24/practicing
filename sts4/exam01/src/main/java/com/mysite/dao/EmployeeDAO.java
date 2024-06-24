package com.mysite.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	public List<Employee> findByEmpName(String empName);
}
