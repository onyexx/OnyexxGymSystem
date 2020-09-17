package za.co.MyGymSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.MyGymSystem.entities.Employee;
import za.co.MyGymSystem.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public String updateEmployee(Employee employee) {
		
				return null;
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> fetchEmployees() {
				return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployee(String email) {
		
		return employeeRepository.findByEmail(email);
	}

	@Override
	public Employee fetchEmployee(int id) {
		
		return employeeRepository.findById(id);
	}

}
