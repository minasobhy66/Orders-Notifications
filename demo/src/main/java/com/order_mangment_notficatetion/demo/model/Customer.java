package com.order_mangment_notficatetion.demo.model;

import com.order_mangment_notficatetion.demo.Service.Order;

public class Customer {

        String name, address, mobile, email, password;
        Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    double balance;

        public double getBalance() {
            return balance;
        }
        public String getAddress() {
            return address;
        }
        public String getEmail() {
            return email;
        }
        public String getMobile() {
            return mobile;
        }
        public String getName() {
            return name;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

}
