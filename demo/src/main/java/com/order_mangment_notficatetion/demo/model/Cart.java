package com.order_mangment_notficatetion.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cart =new ArrayList<Product>();
    double total_price;
    public  void addProduct(Product product){
        cart.add(product);
    }

    public double getTotal_price() {
        total_price=0;
        for (int i = 0; i < cart.size(); i++) {
        total_price+=cart.get(i).getPriceforQuantity();
    }
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public  Product getProduct (int id){
        for (int i = 0; i < cart.size(); i++) {
            if(cart.get(i).getId()==id ) {
                return cart.get(i);
            }
        }
    return null ;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void removeProduct(int id){
        for (int i = 0; i < cart.size(); i++) {
            if(cart.get(i).getId()==id)   ;
            cart.remove(cart.get(i));
        }

    }


    @Override
    public String toString() {
        String JScart="";
        for (int i = 0; i < cart.size(); i++) {
         JScart+=cart.get(i).toString()+',';

        }
        return JScart;
    }

    public Cart() {}
}
