package com.order_mangment_notficatetion.demo.Repositery;

import com.order_mangment_notficatetion.demo.model.Order;

import java.util.Map;

public interface Order_Repository {
    Order addOrder (Order Order);

    Boolean removeOrder (Order order);

    Order uptadeOrder(Order order);
  Order getOrder(int id);

    Map<Integer, Order> getAllrOrder();

}
