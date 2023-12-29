package com.order_mangment_notficatetion.demo.model;

import java.util.Date;

public abstract class Order  {
   private Date dataOrder;
    private Customer customer;
    private Cart cart;
    private Double shipingFess;
    private Stauts stauts;
    private int id;
    public Order() {
    }
    public Order(Customer customer, Cart cart, int id) {
        this.customer = customer;
        this.cart = cart;
        this.id = id;
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


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public abstract void pay();
    public  abstract  void addOrder(Order simpleorder);
    public  abstract void removeOrder(Order simpleorder);
    public abstract Order getOrder(int id);


}
