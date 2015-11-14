package _06_Command;

import _06_Command.client.RemoteControl;
import _06_Command.command.LightOffCommand;
import _06_Command.command.LightOnCommand;
import _06_Command.receiver.Light;

/**
 * 就实现了一个实体，其他的没有实现。因为大同小异
 * 
 * 扩展的有：宏命令模式，这个本质还是命令模式的一种，只是它把多个实体的操作放到一个命令对象中，可以整体管理<br>
 * 然后还有和杨神讨论过的撤销操作，用命令模式加一个栈就可以实现（但是栈要控制深度，不能无限撤销）<br>
 * 然后还有任务的消费，用一个队列来接受命令对象，然后用线程池来消费命令的执行
 * 
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {

        RemoteControl rc = new RemoteControl();

        // 将接收方和命令绑定到命令对象中
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        // 然后把请求方和命令对象绑定一起，完成 invoker 的功能
        rc.setCommand(0, lightOn, lightOff);

        // 然后就可以操作请求方了，操作都是通过命令对象来传输到接收方的
        rc.onButtonPressed(0);
        rc.offButtonPressed(0);

    }
}
