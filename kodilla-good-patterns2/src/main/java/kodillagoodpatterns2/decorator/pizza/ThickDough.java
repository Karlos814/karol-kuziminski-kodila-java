package kodillagoodpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickDough extends AbstractPizzaDecorator {

    public ThickDough(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" on thick dough";
    }
}
