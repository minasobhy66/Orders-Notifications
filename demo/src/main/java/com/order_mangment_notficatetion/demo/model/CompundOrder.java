package com.order_mangment_notficatetion.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CompundOrder extends Order {
    List<Order> orders=new ArrayList<>();
    @Override
    public void pay() {
        for (int i = 0; i < orders.size(); i++) {
            orders.get(i).pay();
        }
    }

    @Override
    public void addOrder(Order simpleorder) {
        orders.add(simpleorder);
    }

    @Override
    public void removeOrder(Order simpleorder) {
        orders.remove(simpleorder);
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

}
