package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.InmomeryOrderRepository;
import com.order_mangment_notficatetion.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerOrder {
    @Autowired
   private InmomeryOrderRepository Repository;
    @GetMapping("/{id}")
   public Order GetOrder(@PathVariable int id){
    return Repository.getOrder(id);
}
}
