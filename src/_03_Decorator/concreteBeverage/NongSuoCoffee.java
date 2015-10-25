package _03_Decorator.concreteBeverage;

import _03_Decorator.Beverage;

/**
 * 浓缩咖啡，不爱喝。太苦，所以要中杯
 * 
 * 
 * 
 * @author niushuai
 *
 */
public class NongSuoCoffee extends Beverage {

    public NongSuoCoffee() {
        description = "浓缩咖啡";
    }

    @Override
    public Double cost() {
        return 30.0;
    }

}
