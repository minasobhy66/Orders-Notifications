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

}
