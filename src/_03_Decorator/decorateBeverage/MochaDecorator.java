package _03_Decorator.decorateBeverage;

import _03_Decorator.Beverage;

/**
 * 抹茶调料
 * 
 * @author niushuai
 *
 */
public class MochaDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加入了抹茶调料...";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 5.0;
    }

}
