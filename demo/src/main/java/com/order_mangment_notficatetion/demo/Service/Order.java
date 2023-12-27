package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.DetailsOrder;
import com.order_mangment_notficatetion.demo.model.Stauts;

import java.util.Date;

public abstract class Order {
    DetailsOrder dataOrder;
    Date dateOrder;
    Stauts statusOrder;
    DetailsOrder detailsOrder;
    Customer customer;

    public DetailsOrder getDetailsOrder() {
        return detailsOrder;
    }

    public void setDetailsOrder(DetailsOrder detailsOrder) {
        this.detailsOrder = detailsOrder;
    }

    public DetailsOrder getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(DetailsOrder dataOrder) {
        this.dataOrder = dataOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Stauts getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Stauts statusOrder) {
        this.statusOrder = statusOrder;
    }

    public Order() {
        dataOrder = new DetailsOrder();
    }

    public abstract void pay();
    public  abstract  void addOrder(Order simpleorder);
    public  abstract void removeOrder(Order simpleorder);
    public abstract Order getOrder(int id);

}
