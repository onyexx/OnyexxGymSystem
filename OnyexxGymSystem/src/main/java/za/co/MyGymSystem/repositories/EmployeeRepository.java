package za.co.MyGymSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.MyGymSystem.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findAll();
	
	Employee  findById(int id);
	
	Employee findByEmail(String email);
	
	Employee deleteById(int id);

}
