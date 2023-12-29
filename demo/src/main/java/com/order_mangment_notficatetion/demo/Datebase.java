package com.order_mangment_notficatetion.demo;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.model.Product;

import java.util.*;

import static com.order_mangment_notficatetion.demo.model.Category.*;

public class Datebase {
    public static Map<Integer, Product>  stock = new HashMap<Integer,Product>();
    public static Map<Integer, Order>  List_order = new HashMap<>();
    public  static  Map<Integer, Customer> DbCustomer=new HashMap<>();
    static Product product=new Product(1,40,"chiken","lol",5,MEATS_CHICKEN);
   public static void test_set() {
       for (int i = 0; i < 5; i++) {
            stock.put(i, product);
        }
    }
}
