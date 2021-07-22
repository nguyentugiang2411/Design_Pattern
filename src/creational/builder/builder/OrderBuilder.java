package creational.builder.builder;

import creational.builder.product.order.Order;
import creational.builder.product.type.BreadType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.SauceType;
import creational.builder.product.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder breadType(BreadType breadType);
    OrderBuilder sauceType(SauceType sauceType);
    OrderBuilder vegetableType(VegetableType vegetableType);
    Order build();
}
