package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.Order;

public interface SimpleOrderService {
public Order getOrder( );
public boolean addOrder(Order order);
public boolean makeOrder(Cart cart, Customer customer);
}
