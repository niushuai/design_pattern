package _03_Decorator.decorateBeverage;

import _03_Decorator.Beverage;

/**
 * 奶油调料
 * 
 * @author niushuai
 *
 */
public class MilkDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加入了奶油调料...";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 2.0;
    }

}
