package za.co.MyGymSystem.services;

import java.util.List;

import za.co.MyGymSystem.entities.Customer;


public interface CustomerService {
	
Customer createCustomer(Customer customer);

String updateCustomer(Customer customer );

void deleteCustomer(int id);

List<Customer> fetchCustomers();

Customer fetchCustomer(String email);

Customer fetchCustomer(int id);
}
