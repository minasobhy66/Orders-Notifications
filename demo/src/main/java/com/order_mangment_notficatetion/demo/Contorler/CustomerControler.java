package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.Service.CartService;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cutomer")
public class CustomerControler {
    @GetMapping("/")
   Customer customer(@RequestParam("id") int id){
        return Datebase.customers.get(id);
    }

}
