package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.PaybyBalance;
import com.order_mangment_notficatetion.demo.Service.paymentService;
import com.order_mangment_notficatetion.demo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class Payment {

    paymentService paymentService= new PaybyBalance() ;

    @PostMapping("/")
    Response Pay(@RequestParam("id") int idOrder) {
        boolean res = paymentService.pay(idOrder);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("this payment refused");
            return response;
        }
        response.setStatus(true);
        response.setMessage("this payment is successfully");
        return response;
    }
}
