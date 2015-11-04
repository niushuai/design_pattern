package _04_Factory.FactoryMthod;

import _04_Factory.FactoryMthod.creator.ConcreteCreator1;
import _04_Factory.FactoryMthod.creator.ConcreteCreator2;
import _04_Factory.SimpleFactory.Product;

/**
 * 这样我们就能在运行时动态改变所需要的产品。仔细一想，可以结合策略模式<br>
 * 每个策略都是 new 出来的，而且策略也是抽象的，所以就可以用到工厂方法把<br>
 * 策略和 new 都抽象出来，整个结构就会更加通用。
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        Product product = new ConcreteCreator1().order("concrete1");
        Product product2 = new ConcreteCreator2().order("concrete2");

        Product product3 = new ConcreteCreator1().order("concrete1other");
        Product product4 = new ConcreteCreator2().order("concrete2other");
    }
}
