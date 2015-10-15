package _01_strategy;

import _01_strategy.displaystrategy.FashionMan;
import _01_strategy.humanentity.Engineer;
import _01_strategy.humanentity.Human;
import _01_strategy.humanentity.SuperStar;

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
