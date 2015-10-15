package design_pattern._01_strategy.humanentity;

import design_pattern._01_strategy.codestrategy.CodeSkill;
import design_pattern._01_strategy.displaystrategy.Display;

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
