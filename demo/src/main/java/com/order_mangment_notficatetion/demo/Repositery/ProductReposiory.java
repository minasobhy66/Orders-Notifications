package com.order_mangment_notficatetion.demo.Repositery;

import com.order_mangment_notficatetion.demo.model.Product;

import java.util.Map;

public interface ProductReposiory {
    public Map<Integer, Product> getAllProduct();
    public void addProduct(Product product);
    public Product getProduct(int id);

    }
