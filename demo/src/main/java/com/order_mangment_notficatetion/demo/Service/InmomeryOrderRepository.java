package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Order;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InmomeryOrderRepository implements Order_Repository{



    @Override
    public Order addOrder(Order order) {
        Datebase.List_order.put(order.getId(), order);
        return order;

    }

    @Override
    public Boolean removeOrder(Order order) {
        return Datebase.List_order.remove(order.getId(),order);
    }
    @Override
    public Order uptadeOrder(Order order) {
        return null;
    }

    @Override
    public  Order getOrder(int id) {
        return Datebase.List_order.get(id);
    }

    @Override
    public Map<Integer, Order> getAllrOrder() {

        return Datebase.List_order;
    }
    public static int setid(){
        return Datebase.List_order.size()+1;
    }
}
