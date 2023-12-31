package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.Repositery.MomeryOrderRepo;
import com.order_mangment_notficatetion.demo.Repositery.MomeryCustomerRepo;
import com.order_mangment_notficatetion.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class ImpSimpleOrderService {
    MomeryOrderRepo Db=new MomeryOrderRepo();
    MomeryCustomerRepo customerRepo=new MomeryCustomerRepo();


    public Order getOrder( int id) {
        return Db.getOrder(id);
    }

    public boolean addOrder(Order order) {

        return false;
    }

//public boolean pay_order(Order order,int customerId ){
//
//}
    public boolean makeOrder(Cart cart,int customerId) {
        try {
            if (customerRepo.getCustomerByID(customerId) != null) {
                Order order=new Order(customerId,cart);
                Db.addOrder(order);
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("eror in MakerOrder because"+e.getMessage());;
            return false;
        }
    }


}


