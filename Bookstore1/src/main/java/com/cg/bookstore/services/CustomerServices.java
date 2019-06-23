package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.beans.Customer;

public interface CustomerServices {
	Customer  acceptCustomerDetails(Customer customer);
	Customer editCustomerDetails(Customer customer);
    List<Customer> getAllCustomerDetails() ;
}
