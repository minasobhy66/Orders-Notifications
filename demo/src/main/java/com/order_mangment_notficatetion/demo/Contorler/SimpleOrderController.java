package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.ImpSimpleOrderService;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.model.Response;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "order")
public class SimpleOrderController {
    @Autowired
    private ImpSimpleOrderService orderService;
    private Order order;

    @GetMapping("/show/")
    public Order viewOrder(@RequestParam("id") int id) {
        return orderService.getOrder(id);
    }
@PostMapping("/add/")
    public Response makeOrder(@RequestBody Cart cart, @RequestParam ("id")int customerId) {
        boolean res = orderService.makeOrder(cart, customerId);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("the order isnot maked");
        } else {
            response.setStatus(true);
            response.setMessage("the order is pinding" );
        }
        return response;
    }

}