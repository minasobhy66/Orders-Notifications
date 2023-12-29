package com.order_mangment_notficatetion.demo.Service;

import com.order_mangment_notficatetion.demo.model.Customer;
import com.order_mangment_notficatetion.demo.model.DetailsOrder;
import com.order_mangment_notficatetion.demo.model.Product;

import java.util.*;

public interface notification_template{
    public void show();
}
class booking_confirmation implements notification_template{
    @Override
    public void show() {
        System.out.println("Dear" + "your booking of the item" + "is confirmed, thanks for using our store :)");
    }
}
class shipping_confirmation implements notification_template{
    @Override
    public void show() {
        System.out.println("Dear" + "your order of id" + "is shipped, thanks for using our store :)");
    }
}

public class Notifications {
    Queue <notification_template> notifications_queue = new LinkedList<>();
    booking_confirmation test1 = new booking_confirmation();
    shipping_confirmation test2 = new shipping_confirmation();
    //Addition is for when certain action X is done in the system
    notifications_queue.add(test1);
    notifications_queue.add(test2);

    public Queue<notification_template> getNotifications_queue() {
        return notifications_queue;
    }
    public void setNotifications_queue(Queue<notification_template> notifications_queue) {
        this.notifications_queue = notifications_queue;
    }
}