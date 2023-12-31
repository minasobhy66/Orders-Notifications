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
            notificationQueue.add("Order"+ @RequestParam("id")  +" completed");
            notificationQueue.add("Payment successful");
            notificationQueue.add( cart +" shipped");
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
