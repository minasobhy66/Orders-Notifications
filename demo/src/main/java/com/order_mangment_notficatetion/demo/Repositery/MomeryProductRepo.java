package com.order_mangment_notficatetion.demo.Repositery;

import com.order_mangment_notficatetion.demo.model.Product;

import java.util.Map;

import static com.order_mangment_notficatetion.demo.Datebase.stock;

public class MomeryProductRepo implements ProductReposiory{
    @Override
    public void addProduct(Product product){
        stock.put(product.getId(),product);
    }
    @Override
    public Product getProduct(int id){
        return stock.get(id);
    }
    @Override
    public  Map<Integer,Product> getAllProduct(){
        return stock;
    }
}
