package com.order_mangment_notficatetion.demo;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.stereotype.Component;

import java.util.*;

import static com.order_mangment_notficatetion.demo.model.Category.*;
@Component
public class Datebase {
    public static Map<Integer, Product>  stock = new HashMap<Integer,Product>();
    public static Map<Integer, Order>  List_order = new HashMap<>();
     public static Map<Integer, Customer> customers = new HashMap<>();
    static Customer customer=new Customer("mina","lol","0123034","lol@gmail.com","sos",100);
   static Product product=new Product(1,40,"chiken","lol",5,MEATS_CHICKEN);
   public Datebase(){
       for (int i = 0; i < 5; i++) {
           stock.put(i, product);
       }
   }

    public static void test_set() {
       for (int i = 0; i < 5; i++) {
            stock.put(i, product);
        }
    }
    public  List<Product> getproducts() {
        return new ArrayList<>(stock.values());
    }
}
