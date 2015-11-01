package _04_Factory.SimpleFactory;

/**
 * 简单工厂方法
 * 
 * 说白了就是把用到 new 的实例化东西抽到一个工厂里，特点是： <br>
 * 工厂把所有事情都一股脑干了。不管啥产品，工厂都可以搞。<br>
 * 但是违反了 ”对修改关闭“的设计原则。只要有新的产品要面世，就要修改工厂，而不是透明。
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("expensive");
        product.display();

        Product product2 = SimpleFactory.createProduct("cheap");
        product2.display();
    }
}
