package kodillagoodpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Asparagus extends AbstractPizzaDecorator{

    public Asparagus(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", asparagus";
    }
}
