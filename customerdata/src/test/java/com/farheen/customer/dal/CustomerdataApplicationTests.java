package com.farheen.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.farheen.customer.dal.entities.Customer;
import com.farheen.customer.dal.repositiories.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	CustomerRepository repo;
	
	@Test
	void testCreateCustomer() {
		Customer customer= new Customer();
		customer.setId(123l);
		customer.setName("Raghav");
		customer.setEmail("raghav.xyz@yzcompany.com");
		repo.save(customer);
	}

}
