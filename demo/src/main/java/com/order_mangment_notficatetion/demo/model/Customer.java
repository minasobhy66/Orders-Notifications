package com.order_mangment_notficatetion.demo.model;

import com.order_mangment_notficatetion.demo.CustomerDatabase;

public class Customer {

       private String name, address, mobile, email, password;
       private Order order;


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
      private   double balance;




    public Customer(String name, String address, String mobile, String email, String password, double balance) {
        this.id = CustomerDatabase.get_size()+1;
        this.name = name;

    public Customer() {
    }



    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

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
