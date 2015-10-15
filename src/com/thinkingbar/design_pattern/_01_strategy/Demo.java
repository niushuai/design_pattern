package com.thinkingbar.design_pattern._01_strategy;

import com.thinkingbar.design_pattern._01_strategy.displaystrategy.FashionMan;
import com.thinkingbar.design_pattern._01_strategy.humanentity.Engineer;
import com.thinkingbar.design_pattern._01_strategy.humanentity.Human;
import com.thinkingbar.design_pattern._01_strategy.humanentity.SuperStar;

public class Demo {
    public static void main(String[] args) {
        Human star = new SuperStar();
        star.display();
        star.code();
        star.eat();
        star.drink();

        System.out.println("\n===========================\n");

        Human engineer = new Engineer();
        engineer.display();
        engineer.code();
        engineer.eat();
        engineer.drink();
        engineer.setDisplay(new FashionMan());
        engineer.display();
    }
}
