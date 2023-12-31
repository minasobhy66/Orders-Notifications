package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.Service.ProductService;
import com.order_mangment_notficatetion.demo.model.Product;
import com.order_mangment_notficatetion.demo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControler {

    @Autowired
    private  final ProductService productService;
    public ProductControler(ProductService productService){
        this.productService=productService;
    }
        @PostMapping("/add/")
        public Response addproduct(@RequestBody Product p) {
            boolean res = productService.AddProduct(p);
            Response response = new Response();
            if (!res) {
                response.setStatus(false);
                response.setMessage("this item Already Exists");
                return response;
            }

            response.setStatus(true);
            response.setMessage("this product"+p.toString() +"add to stock succesfully");
            return response;
        }
    @GetMapping("/{id}")
    public Product GetProduct(@PathVariable int id){
        return productService.GetProduct(id);
    }
    @GetMapping("/all")
    public String addall(){
        Datebase.test_set();
        return "done";
    }
    @GetMapping("/allproducts")
    public List<Product>getproducts(){
        return productService.getproducts();
    }
}
