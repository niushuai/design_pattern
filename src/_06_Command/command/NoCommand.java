package _06_Command.command;

/**
 * 一个很巧妙的设计，类似空对象来代替 null。在大项目中统一管理 null 是非常有必要的
 * 
 * @author niushuai
 *
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println(" 初始化状态：没有命令...");
    }

    @Override
    public void undo() {
        System.out.println("初始化状态：没有撤销...");
    }

}
