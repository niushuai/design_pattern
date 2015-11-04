package _04_Factory.AbstractFactory.creator;

import _04_Factory.AbstractFactory.product.ProductA;
import _04_Factory.AbstractFactory.product.ProductB;

/**
 * 这个就是抽象工厂，里面定义了一个产品族。有没有很像工厂方法？<br>
 * 其实一个很重要的区别就是工厂方法是一个工厂方法，而抽象工厂是多个工厂方法
 * 
 * @author niushuai
 *
 */
public abstract class AbstractFactory {

    public abstract ProductA createA();

    public abstract ProductB createB();
}
