package _03_Decorator.decorateBeverage;

import _03_Decorator.Beverage;

/**
 * 调料装饰者，因为不是具体的调料，所以是 abstract 类型
 * 
 * 同时装饰者要和被装饰者是同一个类型，所以继承自 Beverage
 * 
 * @author niushuai
 *
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
