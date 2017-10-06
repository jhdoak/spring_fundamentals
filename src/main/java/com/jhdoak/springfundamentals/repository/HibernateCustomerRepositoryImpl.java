package com.jhdoak.springfundamentals.repository;

import com.jhdoak.springfundamentals.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Josiah");
        customer.setLastName("Janksonn");

        customers.add(customer);

        return customers;
    }

}
