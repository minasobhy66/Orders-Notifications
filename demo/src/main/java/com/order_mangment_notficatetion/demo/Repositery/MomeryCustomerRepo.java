package com.order_mangment_notficatetion.demo.Repositery;

import com.order_mangment_notficatetion.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

import static com.order_mangment_notficatetion.demo.Datebase.customers;


public class MomeryCustomerRepo implements CustomerRepositery {

    public MomeryCustomerRepo() {
        customers.put(1, new Customer(1, "customer1@gmail.com", "23urui3", "customer1", "02545522554", "shoubra", 100));
        customers.put(2, new Customer(2, "customer2@gmail.com", "wt363ue73", "customer2", "02549874563", "eldokki", 50));
        customers.put(3, new Customer(3, "customer3@gmail.com", "ehw3u323u2", "customer3", "0123654894", "Heliopolis", 1000));
    }



    @Override
    public Customer getCustomerByID(int id) {
        return customers.get(id);
    }

    public void AddCustomer(Customer customer) {
        Customer customer1=new Customer(customer);
        customers.put(customer1.getId(), customer1);

    }

    public List<Customer> getcustomers() {
        return new ArrayList<>(customers.values());
    }

    public Customer getCustomerEmail(String email) {
        int index = 0;
        for (int i = 1; i <= customers.size(); i++) {
            if (customers.get(i).getEmail().equals(email)) {
                index = i;
                break;
            }
        }
        return customers.get(index);
        //return customers.get(email);
    }
    public static int get_size()
    {
        return  customers.size();
    }
}