package _06_Command.client;

import _06_Command.command.Command;
import _06_Command.command.NoCommand;

/**
 * client 端，命令的真实请求者。但是已经通过 Command 和接收者解耦！
 * 
 * @author niushuai
 *
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    private static final Integer BUTTON_NUM = 7;

    public RemoteControl() {
        onCommands = new Command[BUTTON_NUM];
        offCommands = new Command[BUTTON_NUM];

        // 初始化为空命令，这样就不用每次都判断命令是否为空了
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < BUTTON_NUM; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 命令对象已经封装了命令和接收者，这里调用 setCommand 作为请求者和命令对象的连接。<br>
     * 这样就可以通过命令对象解耦请求方和接收方
     * 
     * @param slot 遥控器的槽位
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }
}
