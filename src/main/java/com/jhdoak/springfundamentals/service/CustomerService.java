package com.jhdoak.springfundamentals.service;

import com.jhdoak.springfundamentals.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
