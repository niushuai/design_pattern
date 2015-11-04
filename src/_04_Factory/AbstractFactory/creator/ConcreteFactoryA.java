package _04_Factory.AbstractFactory.creator;

import _04_Factory.AbstractFactory.product.ConcreteProductA_1;
import _04_Factory.AbstractFactory.product.ConcreteProductA_2;
import _04_Factory.AbstractFactory.product.ProductA;
import _04_Factory.AbstractFactory.product.ProductB;

/**
 * 抽象工厂的一个具体工厂，我是小米。
 * 
 * @author niushuai
 *
 */
public class ConcreteFactoryA extends AbstractFactory {

    @Override
    public ProductA createA() {
        return new ConcreteProductA_1();
    }

    @Override
    public ProductB createB() {
        return new ConcreteProductA_2();
    }

}
