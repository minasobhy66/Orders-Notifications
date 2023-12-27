package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.DetailsOrder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InmomeryOrderRepository implements Order_Repository{

    @Override
    public DetailsOrder addOrder(DetailsOrder detailsOrder) {
        Datebase.List_order.put(detailsOrder.getId(), detailsOrder);
        return detailsOrder;

    }

    @Override
    public Boolean removeOrder(DetailsOrder detailsOrder) {
        return Datebase.List_order.remove(detailsOrder.getId(), detailsOrder);
    }

    @Override
    public DetailsOrder uptadeOrder(DetailsOrder detailsOrder) {
        return null;
    }

    @Override
    public DetailsOrder getOrder(int id) {
        if(Datebase.List_order.get(id)!=null){
            return Datebase.List_order.get(id) ;
        }
        return  null;
    }


    @Override
    public List<DetailsOrder> getAllrOrder() {
        return null;
    }


}
