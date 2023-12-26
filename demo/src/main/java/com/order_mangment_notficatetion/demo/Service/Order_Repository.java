package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Order;

import java.util.List;

public interface Order_Repository {
    Order addOrder (Order order);
    Boolean removeOrder (Order order);

    Order uptadeOrder(Order order);
    Order getOrder(int id);

    List<Order> getAllrOrder();

}
