package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Repositery.MomeryOrderRepo;
import com.order_mangment_notficatetion.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerOrder {
    @Autowired
   private MomeryOrderRepo Repository;
    @GetMapping("/{id}")
   public Order GetOrder(@PathVariable int id){
    return Repository.getOrder(id);
}
}
