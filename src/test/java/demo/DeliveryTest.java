package demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import demo.delivery.PostDeliveryStrategy;
import demo.flowers.Flower;
import demo.flowers.FlowerColor;
import demo.flowers.Item;
import demo.delivery.DHLDeliveryStrategy;

public class DeliveryTest {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliveryStrategy dhlDelivery;
    private List<Item> order;
    private final double price = 100;

    @BeforeEach
    public void init() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
        order = List.of(new Flower(price, 0.8, FlowerColor.RED),
                new Flower(price, 0.8, FlowerColor.RED));
    }

    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(order, dhlDelivery.deliver(order));
    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(order, postDelivery.deliver(order));
    }
}
