package com.order_mangment_notficatetion.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cart =new ArrayList<Product>();
    public  void addProduct(Product product){
        cart.add(product);
    }
    public void removeProduct(Product product){
        cart.remove(product);
    }
    public double total_price(){
        double result=0;
        for (int i = 0; i < cart.size(); i++) {
            result+=cart.get(i).getPriceforQuantity();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }

    public Cart() {}
}
