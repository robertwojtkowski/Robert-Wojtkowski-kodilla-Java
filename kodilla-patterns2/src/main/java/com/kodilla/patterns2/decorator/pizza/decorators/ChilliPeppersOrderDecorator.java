package com.kodilla.patterns2.decorator.pizza.decorators;
import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import java.math.BigDecimal;

public class ChilliPeppersOrderDecorator extends AbstractPizzaOrderDecorator {
    public ChilliPeppersOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", papryczki chilli";
    }
}