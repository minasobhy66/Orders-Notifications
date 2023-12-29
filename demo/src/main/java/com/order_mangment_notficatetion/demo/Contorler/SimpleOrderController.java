package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.ImpSimpleOrderService;
import com.order_mangment_notficatetion.demo.Service.SimpleOrderService;
import com.order_mangment_notficatetion.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "order")
public class SimpleOrderController {
    @Autowired
    private SimpleOrderService orderService=new ImpSimpleOrderService();
    @GetMapping("/")
    public Order viewOrder(){
      return orderService.getOrder();
    }

}
