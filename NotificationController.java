package com.order_mangment_notficatetion.demo.Contorler;

import com.order_mangment_notficatetion.demo.Service.paymentService;
import com.order_mangment_notficatetion.demo.model.Cart;
import com.order_mangment_notficatetion.demo.Service.InmomeryOrderRepository;
import com.order_mangment_notficatetion.demo.model.Order;
import com.order_mangment_notficatetion.demo.Datebase;
import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Queue;

@RestController
@RequestMapping("/customer")
public class NotificationController {

    private final Queue<String> notificationQueue = new LinkedList<>();
    Cart cart = cartService.getCart();

    @PostMapping("/action")
    public Response performCustomerAction(@RequestParam("action") String action) {
        // Simulate customer actions
        if ("confirmOrder".equals(action)) {
            // Add notifications to the queue when the customer confirms the order
            addNotification("Order completed", orderId);
            notificationQueue.add("Payment successful");
            addNotification(cart+ "shipped.", orderId);
            return new Response(true, "Order"+ @RequestParam("id")  + "confirmed");
        } else if ("cancelOrder".equals(action)) {
            // Add notifications to the queue when the customer cancels the order
            notificationQueue.add("Order canceled");
            return new Response(true, "Order canceled");
        } else {
            return new Response(false, "Invalid action");
        }
    }

    @GetMapping("/getNotification")
    public Response getNotification() {
        if (!notificationQueue.isEmpty()) {
            String notification = notificationQueue.poll();
            return new Response(true, notification);
        } else {
            return new Response(false, "No notifications available");
        }
    }
    private void addNotification(String template, int orderId) {
        // Replace placeholders in the template with actual data
        String message = template.replace("{orderId}", String.valueOf(orderId));

        // Add the generated message to the notification queue
        notificationQueue.add(message);
    }

    private static class Response {
        private final boolean status;
        private final String message;
        public Response(boolean status, String message) {
            this.status = status;
            this.message = message;
        }

        public boolean isStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}
