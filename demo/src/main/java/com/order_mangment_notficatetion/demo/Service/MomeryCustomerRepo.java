package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Customer;


public class MomeryCustomerRepo implements CustomerRepositery{

    public MomeryCustomerRepo() {
        Datebase.customers.put(1, new Customer(1,"customer1@gmail.com", "23urui3", "customer1", "02545522554", "shoubra",100));
        Datebase.customers.put(2, new Customer(2,"customer2@gmail.com", "wt363ue73", "customer2", "02549874563", "eldokki",50));
        Datebase.customers.put(3, new Customer(3,"customer3@gmail.com", "ehw3u323u2", "customer3", "0123654894", "Heliopolis",1000));
    }

    @Override
    public void addCustomer(Customer user) {
        Datebase.customers.put(user.getId(), user);
    }

    @Override
    public Customer getCustomerByID(int id) {
         return Datebase.customers.get(id);
    }
}
