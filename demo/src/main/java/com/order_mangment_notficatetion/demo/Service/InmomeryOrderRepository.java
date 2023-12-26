package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InmomeryOrderRepository implements Order_Repository{

    @Override
    public Order addOrder(Order order) {
        Datebase.List_order.put(order.getId(),order);
        return order;

    }

    @Override
    public Boolean removeOrder(Order order) {
        return Datebase.List_order.remove(order.getId(), order);
    }

    @Override
    public Order uptadeOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrder(int id) {
        if(Datebase.List_order.get(id)!=null){
            return Datebase.List_order.get(id) ;
        }
        return  null;
    }


    @Override
    public List<Order> getAllrOrder() {
        return null;
    }


}
