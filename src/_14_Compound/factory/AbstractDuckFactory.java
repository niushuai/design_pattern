package _14_Compound.factory;

import _14_Compound.duckentity.Quackable;

/**
 * 上来就整最复杂的抽象工厂模式啊。。。
 * 
 * 还记得工厂模式一共有三种吗？简单工厂模式、工厂模式、抽象工厂模式，区别很简单啦：
 * 
 * 1. 工厂模式就是把所有产品一股脑在一个工厂生产，虽然简单但是违反了开闭原则<br>
 * 2. 工厂方法是将实例化推迟到子类<br>
 * 3. 抽象工厂是解决产品族的问题，一个工厂需要生产一条产品线，而不是单一的产品<br>
 * 比如工厂方法是能生产 LG 电视机、索尼电视机等单一产品，而抽象工厂模式中 LG工厂可以生产<br>
 * LG 电视机、LG 显示器、LG 微波炉，索尼工厂可以生产索尼电视机、索尼单镜头反光式取景照相机等，<br>
 * 也就是一个工厂可以生产一个产品族，而不是一个单一的产品。
 * 
 * @author niushuai
 *
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
