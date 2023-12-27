package com.order_mangment_notficatetion.demo.model;

import java.util.List;

public class DetailsOrder {
    Cart cart;
    private Double totalPrice;
    private Double shipingFess;
    int id;

    public int getId() {
        return id;
    }

    public DetailsOrder() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getShipingFess() {
        return shipingFess;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cart=" + cart.toString() +
                ", totalPrice=" + totalPrice +
                ", shipingFess=" + shipingFess +
                '}';
    }

    public void setShipingFess(Double shipingFess) {
        this.shipingFess = shipingFess;
    }

//    public DetailsOrder(int id, List<Product> cart, Double totalPrice, Double shipingFess) {
//        this.cart = cart;
//        this.totalPrice = totalPrice;
//        this.shipingFess = shipingFess;
//        this.id=id;
//    }




}
