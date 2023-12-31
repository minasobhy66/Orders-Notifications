package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.Repositery.MomeryProductRepo;
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
  private  MomeryProductRepo momeryProductRepo;


    @PostMapping("/add")
    //the api for add item to cart
    public Response addItemCart(@RequestParam("id") int id ,@RequestParam ("quantity")int quantity ) {
        int res = cartService.Additem(id,quantity);
        Response response = new Response();
        switch (res) {
            case 0:
                response.setStatus(true);
                response.setMessage("the item add to cart successfully");
                return response;
            case 1:
                response.setStatus(false);
                response.setMessage("the item alredy exit in cart ");
                return response;
            case 4:
                response.setStatus(false);
                response.setMessage("the quantity is not availab");
                return response;
            default:
                response.setStatus(false);
                response.setMessage("the item not Exists in stock" + res);
                return response;
        }
        }

    @DeleteMapping("/del")
    //the api for delet item from cart
    public Response removeItemCart(@RequestParam int id) {
        Product p= momeryProductRepo.getProduct(id);
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
    @GetMapping()
    //api for view items and total price
    public Cart getcart(){
    return cartService.getCart();
    }

}
