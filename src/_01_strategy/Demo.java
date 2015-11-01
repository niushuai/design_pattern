package _01_Strategy;

import _01_Strategy.displaystrategy.FashionMan;
import _01_Strategy.humanentity.Engineer;
import _01_Strategy.humanentity.Human;
import _01_Strategy.humanentity.SuperStar;

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
/*output:
大家好，我是崔始源~

我喜欢穿喇叭裤！
什么是特么的编程？能吃吗？dogdog
意大利那家的甜品店不错，改天飞过去尝一下
法国路易斯酒庄的葡萄酒很好喝，好想再品尝一次

===========================

大家好，我是程序狗~

我喜欢穿唐装
PHP是最好的语言，不服来辩！
食堂的回锅肉盖浇饭贼好吃啊！！！
服务员，再来一打啤酒！！！
我喜欢穿喇叭裤！
*/
