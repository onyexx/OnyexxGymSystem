package za.co.MyGymSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.MyGymSystem.entities.Employee;
import za.co.MyGymSystem.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee-management/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("employees")
	public List<Employee> fetchAllEmployees(){
		
		return employeeService.fetchEmployees();
		
	}
	
	@GetMapping("employee/{id}")
	public Employee fetchEmployeeById(@PathVariable(name = "id")int id) {
		
		return employeeService.fetchEmployee(id);
		
	}
	
	@GetMapping("employee/email/{email}")
	public Employee fetchEmployeeByEmail(@PathVariable(name = "email") String email) {
		
		return employeeService.fetchEmployee(email);
		
	}
	
	@PostMapping("employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("employee")
	public String updateEmployee(Employee employee) {
		
		return employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping("employee/{id}")
	public void deleteEmployee(@PathVariable(name = "id")int id) {
		
		employeeService.deleteEmployee(id);
	}

}
