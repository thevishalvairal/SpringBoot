package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
