package _03_Decorator;

import _03_Decorator.concreteBeverage.NongSuoCoffee;
import _03_Decorator.concreteBeverage.XingBingLe;
import _03_Decorator.decorateBeverage.MilkDecorator;
import _03_Decorator.decorateBeverage.MochaDecorator;

/**
 * 因为同一个类型，所以调料可以任意装饰饮料。
 * 
 * TIPS:下面beverage2是两份抹茶，但是显示的很“弱智”，因为最外层的装饰者不知道装饰链条的每一个节点，<br>
 * 改进方法就是加一个最外层的 PrettyPrinter。它没有任何作用，就纯粹美化字符串，把最后的 getDescription<br>
 * 给处理一下
 * 
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        Beverage beverage = new NongSuoCoffee();
        System.out.println(beverage.getDescription() + " | " + beverage.cost());

        Beverage beverage2 = new XingBingLe();
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new MilkDecorator(beverage2);
        System.out.println(beverage2.getDescription() + " | " + beverage2.cost());

        Beverage beverage3 = new XingBingLe();
        beverage3 = new MilkDecorator(beverage3);
        System.out.println(beverage3.getDescription() + " | " + beverage3.cost());

    }
}
