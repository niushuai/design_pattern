package _04_Factory.FactoryMthod.creator;

import _04_Factory.SimpleFactory.Product;

/**
 * 工厂方法一般都是：{@code abstract Product factoryMethod(args) }，把实例化推迟到子类实现
 * 
 * 其中，Product 也是抽象，具体实现要根据参数 args 在运行时由子类进行实例化，这样<br>
 * 就有了良好的弹性，不必在代码中写死。
 * 
 * @author niushuai
 *
 */
public abstract class Creator {

    // 如果要在抽象类中有实现的方法，那就做到通用，不让任何一个子类重写该方法。[依赖倒置原则]
    public Product order(String type) {
        Product product = createProduct(type);

        System.out.println("产品包装...");
        product.display();

        return product;
    }

    // 这就是传说中的工厂方法
    abstract Product createProduct(String type);
}
