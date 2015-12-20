package _14_Compound;

import _14_Compound.composite.Flock;
import _14_Compound.decorator.QuackCounter;
import _14_Compound.duckentity.DuckCall;
import _14_Compound.duckentity.MallardDuck;
import _14_Compound.duckentity.Quackable;
import _14_Compound.duckentity.RedheadDuck;
import _14_Compound.duckentity.RubberDuck;
import _14_Compound.factory.AbstractDuckFactory;
import _14_Compound.factory.CountingDuckFactory;
import _14_Compound.gooseAdapter.GooseAdapter;
import _14_Compound.gooseentity.Goose;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

        // 使用抽象工厂模式优化一下
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate() {
        // QuackCounter 是装饰者模式，可以获得叫声的次数
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // 对鹅使用了适配器模式，这样就可以用鸭子的类来控制鹅
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        System.out.println("Duck simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("The ducks quack " + QuackCounter.getQuacks() + " times(exclude goose).");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        System.out.println("\nDuck simulator with abstract duck factory");

        simulate(mallardDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("\nDuck simulator with composite pattern");

        // 主群。
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseAdapter);

        // 红头鸭子群。
        Flock redheadFlock = new Flock();
        Quackable redheadDuck1 = duckFactory.createRedheadDuck();
        Quackable redheadDuck2 = duckFactory.createRedheadDuck();
        Quackable redheadDuck3 = duckFactory.createRedheadDuck();
        Quackable redheadDuck4 = duckFactory.createRedheadDuck();

        redheadFlock.add(redheadDuck1);
        redheadFlock.add(redheadDuck2);
        redheadFlock.add(redheadDuck3);
        redheadFlock.add(redheadDuck4);

        // 主群加入红头鸭子群。Flock 既可以作为叶子，也可以作为集合
        flock.add(redheadFlock);

        // 看看，flock 作为集合和叶子，都是 Quackable
        simulate(flock);
        simulate(redheadFlock);

        System.out.println("The ducks quack " + QuackCounter.getQuacks() + " times(exclude goose).");
    }
}
