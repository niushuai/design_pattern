package _06_Command.command;

/**
 * 命令模式
 * 
 * 持有一个命令接收者对象，和一个或一系列要执行的动作
 * 
 * @author niushuai
 *
 */
public interface Command {

    /**
     * 调用执行者执行命令
     */
    public void execute();

    /**
     * 撤销操作
     */
    public void undo();
}
