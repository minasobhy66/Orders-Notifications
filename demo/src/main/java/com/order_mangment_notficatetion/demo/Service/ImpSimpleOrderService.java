package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class ImpSimpleOrderService implements SimpleOrderService{
    InmomeryOrderRepository Db;
    Order order=new SimpleOrder();

    @Override
    public Order getOrder( ) {
        return order;
    }

    @Override
    public boolean addOrder(Order order) {

        return false;
    }

    @Override
    public boolean makeOrder(Cart cart, Customer customer) {
        return false;
    }

}


