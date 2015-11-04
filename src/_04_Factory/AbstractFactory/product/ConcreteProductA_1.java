package _04_Factory.AbstractFactory.product;

/**
 * 小米的产品
 * 
 * @author niushuai
 *
 */
public class ConcreteProductA_1 extends ProductA {

    @Override
    public void display() {
        System.out.println("小米手机，为发烧而生（啊，手机好烫。。。）");
    }

}
