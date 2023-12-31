package com.order_mangment_notficatetion.demo.model;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.DetailsOrder;
import com.order_mangment_notficatetion.demo.model.Product;
public interface notification_template{
    public void show();
}
class booking_confirmation implements notification_template{
    Customer customer;
    DetailsOrder detailsOrder;
    @Override
    public void show() {
        System.out.println("Dear" + customer.getName() + "your booking of the item" + detailsOrder.getCart().toString() + "is confirmed, thanks for using our store :)");
    }
}
class shipping_confirmation implements notification_template{
    Customer customer;
    DetailsOrder detailsOrder;
    @Override
    public void show() {
        System.out.println("Dear" + customer.getName() + "your order of id" + detailsOrder.getId() + "is shipped, thanks for using our store :)");
    }
}