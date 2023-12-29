package com.order_mangment_notficatetion.demo.model;

public class Product {
    private int serial, quantity;
    private String name, vendor;
    private double price;
    private Category category;
    @Override
    public String toString() {
        return "Product{" +
                "serial=" + serial +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }



    public Product(int serial, int quantity, String name, String vendor, double price, Category category) {
        this.serial = serial;
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

    public void setSerial(int serial) {
        this.serial = serial;
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

    public int getSerial() {
        return serial;
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
}
