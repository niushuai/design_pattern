package _06_Command.command;

import _06_Command.receiver.Light;

/**
 * 具体的命令，将命令的接收方和命令封装到一个对象中
 * 
 * @author niushuai
 *
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
