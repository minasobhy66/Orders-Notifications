package com.order_mangment_notficatetion.demo.model;

public class Product {
    private int id, quantity;
    private String name, vendor;
    private double price;
    private Category category;


    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.vendor = product.vendor;
        this.price = product.price;
        this.category =product.category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }



    public Product(int id, int quantity, String name, String vendor, double price, Category category) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.vendor = vendor;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public double getPriceforQuantity() {
        return price * quantity;
    }

    public String getVendor() {
        return vendor;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
