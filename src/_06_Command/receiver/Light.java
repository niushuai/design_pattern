package _06_Command.receiver;

/**
 * 命令的接收者，通过 Command 将命令的请求方和执行方解耦
 * 
 * @author niushuai
 *
 */
public class Light {
    public void on() {
        System.out.println("Mom sleep, 开灯 high!!!");
    }

    public void off() {
        System.out.println("关灯，洗洗睡了...");
    }
}
