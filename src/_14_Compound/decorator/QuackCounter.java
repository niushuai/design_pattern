package _14_Compound.decorator;

import _14_Compound.duckentity.Quackable;

/**
 * 装饰者模式，包装了一下 Quackable 接口，这样就可以统计鸭子的叫声次数。
 * 
 * @author niushuai
 *
 */
public class QuackCounter implements Quackable {

    private Quackable duck;
    private static Integer numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static Integer getQuacks() {
        return numberOfQuacks;
    }

}
