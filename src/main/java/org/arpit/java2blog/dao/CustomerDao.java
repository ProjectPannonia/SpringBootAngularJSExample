package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	public Customer getCustomer(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	
	
}
