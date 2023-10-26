package demo.delivery;

import java.util.List;

import demo.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("Delivered by post");
        return items;
    }
}