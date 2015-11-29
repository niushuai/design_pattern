package _12_State.state;

/**
 * 自动售货机的动作，投币、退币、按按钮、出货
 * 
 * 这里比较恶心的是没有做成一个抽象类，把一些通用的东西给抽出来，比如每个状态的无效状态都可以<br>
 * 搞成 unsupportedOperationException 或者有默认实现，而不用在每个状态里面都搞一遍。也挺恶心的<br>
 * 排查起来还得一个一个扒出来看。。。
 * 
 * 状态模式和策略模式几乎类似，但是策略模式是用户主动选择某一种策略，比如我想要离线的策略就用 hadoop，想<br>
 * 用实时的就选择 storm。而状态模式是一个完整的工作流的转换，一般会涉及到几个或者全部状态的切换。而策略模式<br>
 * 一般是单个选择。
 * 
 * 所以两者之间一个是客户主动选择策略，一个是工作流的多个状态正常切换。只是他们的结构非常相似而已
 * 
 * @author niushuai
 *
 */
public interface State {

    public void insert();

    public void eject();

    public void turnCrank();

    public void dispense();
}
