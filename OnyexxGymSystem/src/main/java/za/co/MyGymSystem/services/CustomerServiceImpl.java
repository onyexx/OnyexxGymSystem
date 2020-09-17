package za.co.MyGymSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.MyGymSystem.entities.Customer;
import za.co.MyGymSystem.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		
				return customerRepository.save(customer);
	}

	@Override
	public String updateCustomer(Customer customer) {
		
				return null;
	}

	@Override
	public void deleteCustomer(int id) {
		
		 customerRepository.deleteById(id);
	}

	@Override
	public List<Customer> fetchCustomers() {
		
		return customerRepository.findAll();
	}


	@Override
	public Customer fetchCustomer(String email) {
	
		return customerRepository.findByEmail(email);
	}

	@Override
	public Customer fetchCustomer(int id) {
				return customerRepository.findById(id);
	}

}
