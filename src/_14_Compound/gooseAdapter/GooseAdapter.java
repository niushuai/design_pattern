package _14_Compound.gooseAdapter;

import _14_Compound.duckentity.Quackable;
import _14_Compound.gooseentity.Goose;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

}
