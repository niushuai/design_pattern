package _04_Factory.AbstractFactory.creator;

import _04_Factory.AbstractFactory.product.ConcreteProductB_1;
import _04_Factory.AbstractFactory.product.ConcreteProductB_2;
import _04_Factory.AbstractFactory.product.ProductA;
import _04_Factory.AbstractFactory.product.ProductB;

/**
 * 抽象工厂的另一个具体工厂，大家好，我是锤子
 * 
 * @author niushuai
 *
 */
public class ConcreteFactoryB extends AbstractFactory {

    @Override
    public ProductA createA() {
        return new ConcreteProductB_1();
    }

    @Override
    public ProductB createB() {
        return new ConcreteProductB_2();
    }

}
