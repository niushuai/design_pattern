package _09_Template;

/**
 * 这是一个抽象模板，注意区分它和策略模式的区别:<br>
 * 
 * 1) 策略模式使用的是组合，而模板模式使用的是继承<br>
 * 2) 策略模式实现的整个算法，而继承模式实现的是算法的一部分（框架由模板方法确定)，下面例子只需要实现 sortMethod<br>
 * 3) 模板方法中的sortMethod()是经过抽象后的结果，具有更高的抽象度。比如原来两个排序类一个是排序数组，一个是排序 List,<br>
 * 那么经过模板模式后，就可以统一为sortMethod()，具体实现由继承的子类实现，而算法框架由模板方法统一规定，且其中除 sortMethod<br>
 * 经被父类实现，节省了单独类的重复实现，满足第一章的重复要提取复用的OO 设计原则。
 * 
 * @author niushuai
 *
 */
public abstract class SortTemplate {

    // 这是排序算法的模板
    public void sort() {
        input();
        sortMethod();
        if (isPrint()) {
            display();
        }
    }

    private void input() {
        System.out.println("请输入您要排序的内容...");
    }

    protected abstract void sortMethod();

    private void display() {
        System.out.println("排序后的结果是...");
    }

    /*
     * 这是一个钩子方法，可以由子类自定义覆盖。JFrame 里就有大量的钩子方法
     */
    public boolean isPrint() {
        return true;
    }
}
