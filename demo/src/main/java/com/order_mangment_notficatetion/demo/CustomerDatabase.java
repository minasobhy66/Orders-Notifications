package com.order_mangment_notficatetion.demo;
import com.order_mangment_notficatetion.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class CustomerDatabase {
    private static final Map<Integer, Customer> customers = new HashMap<>();
    public CustomerDatabase() {
        // Initialize the map with five sample users
        customers.put(1, new Customer("customer1", "shoubra", "02545522554", "customer1@gmail.com", "23urui3",100.0));
        customers.put(2, new Customer("customer2", "eldokki", "02549874563", "customer2@gmail.com", "wt363ue73",80.0));
        customers.put(3, new Customer("customer3", "Heliopolis", "02123654894", "customer3@gmail.com", "ehw3u323u2",200.0));
    }
    public void AddCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }
    public List<Customer> getcustomers() {
        return new ArrayList<>(customers.values());
    }
    public Customer getCustomerEmail(String email) {
        int index=0;
        for(int i=1;i<=customers.size();i++){
            if (customers.get(i).getEmail().equals(email)){
                index=i;
                break;
            }
        }
        return customers.get(index);
        //return customers.get(email);
    }
    public static int get_size(){
        return customers.size();
    }
}
