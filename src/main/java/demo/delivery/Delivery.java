package demo.delivery;
import java.util.List;

import demo.flowers.Item;

public interface Delivery {
    List<Item> deliver(List<Item> items);
}