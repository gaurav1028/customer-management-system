package com.cs.customerapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_db")
public class Customer {
	@Id
	@Column(name = "customerId")
	private int customerId;

	@Column(name = "customerName", length = 50, nullable = false)
	private String customerName;

	@Column(name = "joinDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joinDate;

//	@Column(unique = true)
//	private String email;
}
