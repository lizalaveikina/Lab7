package demo.delivery;

import java.util.List;

import demo.flowers.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("Delivered by DHL");
        return items;
    }
}