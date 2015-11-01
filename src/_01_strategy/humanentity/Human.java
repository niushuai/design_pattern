package _01_Strategy.humanentity;

import _01_Strategy.codestrategy.CodeSkill;
import _01_Strategy.displaystrategy.Display;

public abstract class Human {

    protected CodeSkill codeSkill;
    protected Display display;

    public abstract void eat();

    public abstract void drink();

    public void code() {
        codeSkill.code();
    }

    public void display() {
        display.display();
    }

    public void setCodeSkill(CodeSkill codeSkill) {
        this.codeSkill = codeSkill;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

}
