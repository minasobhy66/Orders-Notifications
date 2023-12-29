package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
   private Product product;
public Boolean AddProduct(Product p){
    try {
        if(Datebase.stock.get(p.getSerial()) != null){
            return false;
        }
        Datebase.stock.put(p.getSerial(), p);
    } catch (Exception e) {
        System.out.println("Exception in addPerson as" + e.getMessage());
        return false;
    }
    return true;

}
public Product GetProduct( int Serial){
    return Datebase.stock.get(Serial);}

}
