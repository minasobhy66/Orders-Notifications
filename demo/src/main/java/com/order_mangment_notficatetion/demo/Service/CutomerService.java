package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.DetailsOrder;
import com.order_mangment_notficatetion.demo.model.Product;

import java.util.List;

public class CutomerService {
    Customer customer;
    public void makeSimpleOrder(){

        Order simple=new SimpleOrder();
        simple.setCustomer(customer);
    }
    public void makeCampoundOrder(){

    }
}
