package com.order_mangment_notficatetion.demo.Service;


import com.order_mangment_notficatetion.demo.Repositery.MomeryProductRepo;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.model.Product;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private MomeryProductRepo momeryProductRepo=new MomeryProductRepo();
    Cart cart =new Cart();
    public int Additem( int id,int quantity) {
        try {
            Product product = new Product(momeryProductRepo.getProduct(id));
            if (cart.getProduct(product.getId()) != null) {
                return 1;
            }
            if (momeryProductRepo.getProduct(id) != null) {
                if (quantity >momeryProductRepo.getProduct(id).getQuantity()) {
                    System.out.println(product.getQuantity());
                    return 4;
                } else {
                    product.setQuantity(quantity);
                    cart.addProduct(product);
                    int m=0;
                    m=momeryProductRepo.getProduct(id).getQuantity()-quantity;
                    momeryProductRepo.getProduct(id).setQuantity(m);
                    return 0;
                }
            }

        } catch (Exception e) {
            System.out.println("Exception in add product to cart as" + e.getMessage());
        }
        return 3;

    }
    public Boolean Removeitem( Product product){
        try {
            if(cart.getProduct(product.getId()) == null){
                return false;
            }
            cart.removeProduct(product.getId());
        } catch (Exception e) {
            System.out.println("Exception in remove to cart as" + e.getMessage());
            return false;
        }
        return true;

    }
    public Cart getCart(){
    return cart;
    }
}
