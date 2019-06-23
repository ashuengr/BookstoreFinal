package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.daoservices.CustomerDao;
@Component("customerServices")
public class CustomerServiceImpl implements CustomerServices{
	@Autowired
    private CustomerDao customerDao;
	@Override
	public Customer acceptCustomerDetails(Customer customer) {
		return customerDao.save(customer);

	}

	@Override
	public Customer editCustomerDetails(Customer customer) {
		return customerDao.save(customer);

	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerDao.findAll();

	}

}
