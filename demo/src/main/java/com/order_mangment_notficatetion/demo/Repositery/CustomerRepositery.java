package com.order_mangment_notficatetion.demo.Repositery;

import com.order_mangment_notficatetion.demo.model.Customer;

import java.util.List;

public interface CustomerRepositery {
    public void AddCustomer(Customer customer);
    public Customer getCustomerByID(int ID) ;
    public List<Customer> getcustomers() ;
    public Customer getCustomerEmail(String email);


}
