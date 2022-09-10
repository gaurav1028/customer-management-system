package com.cs.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.customerapp.model.Customer;
import com.cs.customerapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return repo.findById(customerId).get();
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		repo.deleteById(customerId);
		return !repo.existsById(customerId);
	}

	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<Customer> seachCustomerByname(String customerName) {
		// TODO Auto-generated method stub
		return repo.findByCustomerName(customerName);
	}

}
