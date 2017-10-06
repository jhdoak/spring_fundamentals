package com.jhdoak.springfundamentals.service;

import com.jhdoak.springfundamentals.model.Customer;
import com.jhdoak.springfundamentals.repository.CustomerRepository;
import com.jhdoak.springfundamentals.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}