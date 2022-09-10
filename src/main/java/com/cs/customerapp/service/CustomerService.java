package com.cs.customerapp.service;

import java.util.List;

import com.cs.customerapp.model.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

	public Customer getCustomer(int customerId);

	public boolean deleteCustomer(int customerId);

	public Customer updateCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public List<Customer> seachCustomerByname(String customerName);

}
