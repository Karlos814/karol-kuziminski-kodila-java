package kodillagoodpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Chicken extends AbstractPizzaDecorator{

    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", chicken";
    }
}
