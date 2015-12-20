package _14_Compound.factory;

import _14_Compound.decorator.QuackCounter;
import _14_Compound.duckentity.DuckCall;
import _14_Compound.duckentity.MallardDuck;
import _14_Compound.duckentity.Quackable;
import _14_Compound.duckentity.RedheadDuck;
import _14_Compound.duckentity.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
