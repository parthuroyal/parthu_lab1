package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {

	String generateUserEmail(String firstName, String lastName, String departmentName);

	String generateUserPassword();

	void displayEmployeeDetails(Employee e1);
}
