package com.order_mangment_notficatetion.demo;

import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.model.Product;

import java.util.*;

import static com.order_mangment_notficatetion.demo.model.Category.*;

public class Datebase {
    public static Map<Integer, Product>  stock = new HashMap<Integer,Product>();
    public static Map<Integer, Order>  List_order = new HashMap<Integer,Order>();

    public static void test_set(){

        List<Product> m =new ArrayList<Product>(3);

        Product P=new Product(1,1,"water","lol",7,BEVERAGES);
        Product M=new Product(2,1,"pepsi","lol",7,BEVERAGES);
        Product N=new Product(3,1,"s7","lol",7,BEVERAGES);
        m.add(P);
        m.add(M);
        m.add(N);
        Order o =new Order(1,m,21.0,9.0);
        Order s =new Order(2,m,21.0,9.0);
        Order p=new Order(3,m,21.0,9.0);
        List_order.put(1,o);
        List_order.put(2,s);
        List_order.put(3,p);
    }
    public void test_prod(){
        Product P=new Product(1,1,"water","lol",7,BEVERAGES);
        Product M=new Product(2,1,"pepsi","lol",7,BEVERAGES);
        Product N=new Product(3,1,"s7","lol",7,BEVERAGES);

        stock.put(1,P);
        stock.put(2,M);
        stock.put(3,N);

    }
}
