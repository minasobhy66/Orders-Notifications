package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CutomerService {
    private final CustomerDatabase customerDatabase;
    @Autowired
    public CutomerService(CustomerDatabase customerDatabase) {
        this.customerDatabase = customerDatabase;
    }
    public boolean registerCustomer(Customer customer) {
        String cutomer_email=customer.getEmail();
        if(customerDatabase.getCustomerEmail(cutomer_email)!=null){
            return false;
        }else{
            customerDatabase.AddCustomer(customer);
            return true;
        }
    }
    public List<Customer> getcustomers() {
        return customerDatabase.getcustomers();
    }
    public boolean loginCustomer(String email, String password) {
        Customer customer = customerDatabase.getCustomerEmail(email);
        if(customer != null && customer.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
    public Customer getCustomerEmail(String email) {
        return customerDatabase.getCustomerEmail(email);
    }


}
