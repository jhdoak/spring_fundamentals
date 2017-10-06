package com.jhdoak.springfundamentals.repository;

import com.jhdoak.springfundamentals.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
