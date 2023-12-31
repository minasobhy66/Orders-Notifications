package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Customer;

public interface CustomerRepositery {
    public void addCustomer(Customer user);

    public Customer getCustomerByID(int ID) ;
}
