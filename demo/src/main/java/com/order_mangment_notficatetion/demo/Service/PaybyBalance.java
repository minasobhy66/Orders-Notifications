package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.model.Stauts;

import java.util.Date;

public class PaybyBalance implements paymentService {
    InmomeryOrderRepository repository=new InmomeryOrderRepository();

    public boolean checkBalnce(double amount, double balance) {
        if (amount < balance) {
            balance = amount - balance;
            return true;
        } else
            return false;
    }

    @Override
    public boolean pay(int id) {
        try {
            double amount=0,balance=0;
            Order order;
            order = repository.getOrder(id);
            if (order != null) {
                amount=order.getTotal_amount();
                balance=Datebase.customers.get(order.getCustomer_id()).getBalance();
                if (amount < balance) {
                    balance =  balance- amount;
                    Datebase.customers.get(order.getCustomer_id()).setBalance(balance);
                    order.setStauts(Stauts.PAID);
                    System.out.println(Datebase.customers.get(order.getCustomer_id()).toString());

                    return true;
                } else
                    return false;
            } else
                return false;
        } catch (Exception e) {
            System.out.println("Exception in pay because" + e.getMessage());
            return false;
        }
    }
}


