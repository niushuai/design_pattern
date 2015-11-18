package _09_Template;

public class BubbleSort extends SortTemplate {

    @Override
    protected void sortMethod() {
        System.out.println("使用冒泡排序...");
    }

    // 这里我们使用了钩子方法，改变了算法框架！！！
    @Override
    public boolean isPrint() {
        System.out.println(" 太慢了，，，，不需要展现排序结果了。主人已经去吃饭了");
        return false;
    }

}
