package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.CartService;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Product;
import com.order_mangment_notficatetion.demo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cart")
public class CartControler {
    @Autowired
   private CartService cartService;
    private Cart cart;


    @PostMapping("/add")
    //the api for add item to cart
    public Response addItemCart(@RequestBody Product p) {
        int res = cartService.Additem(p);
        Response response = new Response();
        if (res==0) {
            response.setStatus(false);
            response.setMessage("the item not Exists in stock ");
            return response;
        }
        else if (res ==1){
            response.setStatus(false);
            response.setMessage("the item alredy exit in cart ");
            return response;
        }

        response.setStatus(true);
        response.setMessage("the item" +p.toString() +"add to cart successfully");
        return response;
    }
    @DeleteMapping("/del")
    //the api for delet item from cart
    public Response removeItemCart(@RequestBody Product p) {
        boolean res = cartService.Removeitem(p);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("the product not Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("the item" +p.toString() +" remove from cart successfully");
        return response;
    }
    @GetMapping("/cart")
    //api for view items and total price
    Cart getcart(){
    return cartService.getCart();
    }

}
