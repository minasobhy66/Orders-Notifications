package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.DetailsOrder;

import java.util.List;

public interface Order_Repository {
    DetailsOrder addOrder (DetailsOrder detailsOrder);
    Boolean removeOrder (DetailsOrder detailsOrder);

    DetailsOrder uptadeOrder(DetailsOrder detailsOrder);
    DetailsOrder getOrder(int id);

    List<DetailsOrder> getAllrOrder();

}
