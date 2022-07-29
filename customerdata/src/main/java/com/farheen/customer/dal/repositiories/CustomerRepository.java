package com.farheen.customer.dal.repositiories;

import org.springframework.data.repository.CrudRepository;

import com.farheen.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
