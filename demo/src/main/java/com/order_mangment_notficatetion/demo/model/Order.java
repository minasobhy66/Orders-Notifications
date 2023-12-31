package com.order_mangment_notficatetion.demo.model;

import com.order_mangment_notficatetion.demo.Service.InmomeryOrderRepository;

import java.util.Date;

public  class Order  {
   private Date dataOrder;
    private int customer_id;
    private Cart cart;
    private Double shipingFess;
    private double Total_amount;
    private Stauts stauts;

    public double getTotal_amount() {
        return shipingFess+ cart.getTotal_price();
    }

    public void setTotal_amount(double total_amount) {
        Total_amount = total_amount;
    }

    private int id;
    public Order() {
    }
    public Order(int customer, Cart cart) {
        this.customer_id = customer;
        this.cart = cart;
        this.id = InmomeryOrderRepository.setid();
        this.stauts=Stauts.CREATE;
        this.shipingFess=30.0;
    }


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Double getShipingFess() {
        return shipingFess;
    }

    public void setShipingFess(Double shipingFess) {
        this.shipingFess = shipingFess;
    }

    public Stauts getStauts() {
        return stauts;
    }

    public void setStauts(Stauts stauts) {
        this.stauts = stauts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Date getDataOrder() {
        return dataOrder=new Date();
    }

    public void setDataOrder(Date dataOrder) {
        this.dataOrder = dataOrder;
    }


    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }


    @Override
    public String toString() {
        return "Order{" +
                "dataOrder=" + dataOrder +
                ", customer_id=" + customer_id +
                ", cart=" + cart.toString() +
                ", shipingFess=" + shipingFess +
                ", Total_amount=" + Total_amount +
                ", stauts=" + stauts +
                ", id=" + id +
                '}';
    }
}
