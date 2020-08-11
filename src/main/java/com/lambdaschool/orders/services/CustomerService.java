package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomerOrders();
    Customer findCustomerById(long id);
    List<Customer> listCustomerByLikeName(String thename);
}
