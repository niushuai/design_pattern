package _01_Strategy.humanentity;

import _01_Strategy.codestrategy.PHPCoder;
import _01_Strategy.displaystrategy.ClassicMan;

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
