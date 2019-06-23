package com.cg.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.services.CustomerServices;

@Controller
public class CustomerController {
	@Autowired
CustomerServices customerServices;
	@RequestMapping(value= {"/acceptCustomerDetails"},method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
			public ResponseEntity<String> acceptCustomerDetails(@RequestBody Customer customer){
				customer = customerServices.acceptCustomerDetails(customer);
			return new ResponseEntity<>("Customer details successfully added.\n Customer ID: "+customer.getCustomerId(),HttpStatus.OK);
			}
	
	@RequestMapping(value= {"/getAllCustomerDetails"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
			public ResponseEntity<List<Customer>> getCustomerDetailsPathParam(){
			return new ResponseEntity<List<Customer>>(customerServices.getAllCustomerDetails(),HttpStatus.OK);
			}
}
