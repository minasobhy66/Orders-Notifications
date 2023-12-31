package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.Repositery.MomeryProductRepo;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ProductService {

   private  Product product;
   private  MomeryProductRepo momeryProductRepo =new MomeryProductRepo();

public Boolean AddProduct(Product p){
    try {
        if(Datebase.stock.get(p.getId()) != null){
            return false;
        }
        else
        Datebase.stock.put(p.getId(), p);
    } catch (Exception e) {
        System.out.println("Exception in add product as" + e.getMessage());
        return false;
    }
    return true;

}
public Product GetProduct( int Serial){
    return Datebase.stock.get(Serial);}
    public Map<Integer, Product> getproducts() {
        return momeryProductRepo.getAllProduct();
    }

}
