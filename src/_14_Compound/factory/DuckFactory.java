package _14_Compound.factory;

import _14_Compound.duckentity.DuckCall;
import _14_Compound.duckentity.MallardDuck;
import _14_Compound.duckentity.Quackable;
import _14_Compound.duckentity.RedheadDuck;
import _14_Compound.duckentity.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
