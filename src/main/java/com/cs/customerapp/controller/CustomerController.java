package com.cs.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cs.customerapp.model.Customer;
import com.cs.customerapp.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return service.getAllCustomer();
	}

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return service.getCustomer(id);
	}

	@PostMapping("/customers")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

	@DeleteMapping("/customers/{id}")
	public boolean deleteCustomer(@PathVariable("id") int id) {
		return service.deleteCustomer(id);
	}

	@PutMapping("/customers")
	public Customer updateCustomer(Customer customer) {
		return service.updateCustomer(customer);
	}

	@GetMapping("/employees/name/{name}")
	public List<Customer> getCustomerByname(@PathVariable String name) {
		return service.seachCustomerByname(name);
	}
}
