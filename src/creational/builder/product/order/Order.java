package creational.builder.product.order;

import creational.builder.product.type.BreadType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.SauceType;
import creational.builder.product.type.VegetableType;

public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
    
    public Order (
        OrderType orderType,
        BreadType breadType,
        SauceType sauceType,
        VegetableType vegetableType
    ) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
                + ", vegetableType=" + vegetableType + "]";
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
