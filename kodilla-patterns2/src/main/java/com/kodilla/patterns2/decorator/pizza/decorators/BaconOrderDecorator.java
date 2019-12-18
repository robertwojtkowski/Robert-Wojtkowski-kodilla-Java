package com.kodilla.patterns2.decorator.pizza.decorators;
import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import java.math.BigDecimal;

public class BaconOrderDecorator extends AbstractPizzaOrderDecorator {
    public BaconOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", boczek";
    }
}
