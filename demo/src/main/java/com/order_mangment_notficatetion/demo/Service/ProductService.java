package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

   private  Product product;
   private final Datebase datebase;
    @Autowired
   public ProductService(Datebase datebase){
       this.datebase=datebase;
   }
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
    public  List<Product> getproducts() {
        return datebase.getproducts();
    }

}
