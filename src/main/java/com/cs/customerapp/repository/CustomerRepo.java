package com.cs.customerapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.customerapp.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	public List<Customer> findByCustomerName(String employeeName);

//	@Query(value = "from Employee where employeeName=:employeeName")
//	public List<Employee> searchByName(String employeeName);
}
