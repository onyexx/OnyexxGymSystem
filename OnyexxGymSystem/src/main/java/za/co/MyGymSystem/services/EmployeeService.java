package za.co.MyGymSystem.services;

import java.util.List;

import za.co.MyGymSystem.entities.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	String updateEmployee(Employee employee);
	
	void deleteEmployee(int id);
	
	List<Employee> fetchEmployees();
	
	Employee fetchEmployee(String email);
	
	Employee fetchEmployee(int id);
	
	

}
