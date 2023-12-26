package com.order_mangment_notficatetion.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> cart =new ArrayList<Product>();
    private Double totalPrice;
    private Double shipingFess;
    int id;

    public int getId() {
        return id;
    }

    public Order() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
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
                "cart=" + cart +
                ", totalPrice=" + totalPrice +
                ", shipingFess=" + shipingFess +
                '}';
    }

    public void setShipingFess(Double shipingFess) {
        this.shipingFess = shipingFess;
    }

    public Order(int id,List<Product> cart, Double totalPrice, Double shipingFess) {
        this.cart = cart;
        this.totalPrice = totalPrice;
        this.shipingFess = shipingFess;
        this.id=id;
    }




}
