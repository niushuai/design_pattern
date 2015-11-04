package _04_Factory.AbstractFactory;

import _04_Factory.AbstractFactory.creator.AbstractFactory;
import _04_Factory.AbstractFactory.creator.ConcreteFactoryA;
import _04_Factory.AbstractFactory.creator.ConcreteFactoryB;
import _04_Factory.AbstractFactory.product.ProductA;
import _04_Factory.AbstractFactory.product.ProductB;

/**
 * 来个简单的 demo。
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("屌丝昨天中大奖，想买个手机和一个电视。。。正好看到两个商店并排在我眼前。。\n");

        AbstractFactory xiaomi = new ConcreteFactoryA();
        AbstractFactory chuizi = new ConcreteFactoryB();

        System.out.println("锤子手机看着挺装逼啊，老板来一个！");
        ProductA phone = chuizi.createA();
        phone.display();

        System.out.println("\n=============\n");

        System.out.println("然而锤子情怀过度，电视又跳票3次了。。。");
        ProductB tv = xiaomi.createB();
        tv.watchTV();

    }
}
