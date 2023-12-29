package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    Cart cart =new Cart();
    public int Additem( Product product){
        try {
            if(Datebase.stock.get(product.getSerial())==null){
                return 0;
            }

            else if(cart.getProduct(product.getSerial()) != null){
                return 1;
            }
            cart.addProduct(product);
        } catch (Exception e) {
            System.out.println("Exception in add product to cart as" + e.getMessage());
            return 3;
        }
        return 2;

    }
    public Boolean Removeitem( Product product){
        try {
            if(cart.getProduct(product.getSerial()) == null){
                return false;
            }
            cart.removeProduct(product.getSerial());
        } catch (Exception e) {
            System.out.println("Exception in remove to cart as" + e.getMessage());
            return false;
        }
        return true;

    }
    public Cart getCart(){
    return cart;
    }
}
