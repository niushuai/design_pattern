package design_pattern._01_strategy.humanentity;

import design_pattern._01_strategy.codestrategy.PHPCoder;
import design_pattern._01_strategy.displaystrategy.ClassicMan;

public class Engineer extends Human {

    public Engineer() {
        System.out.println("大家好，我是程序狗~\n");
        this.codeSkill = new PHPCoder();
        this.display = new ClassicMan();
    }

    @Override
    public void eat() {
        System.out.println("食堂的回锅肉盖浇饭贼好吃啊！！！");
    }

    @Override
    public void drink() {
        System.out.println("服务员，再来一打啤酒！！！");
    }

}
