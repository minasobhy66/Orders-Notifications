package com.order_mangment_notficatetion.demo.Contorler;
import com.order_mangment_notficatetion.demo.Service.CutomerService;
import com.order_mangment_notficatetion.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Customer")
public class CustomerController {
    private final CutomerService customerService;
    @Autowired
    public CustomerController(CutomerService customerService){
        this.customerService=customerService;
    }
    @PostMapping("/register")
    public String registerCustomer(@RequestBody Customer customer) {
        if(!customerService.registerCustomer(customer)){
            return "This email is already exists please enter another email";
        }else{
            return "registered successfully!";
        }
        //customerService.registerCustomer(Customer);
    }
    @PostMapping("/login")
    public String loginCustomer(@RequestParam String email, @RequestParam String password) {
        if (customerService.loginCustomer(email, password)) {
            return "Login successful!";
        } else {
            return "Invalid credentials. Please try again.";
        }
    }
    @GetMapping("/getallcustomers")
    public List<Customer> getcustomers() {
        return customerService.getcustomers();
    }
}
