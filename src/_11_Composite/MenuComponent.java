package _11_Composite;

/**
 * 为解决上个迭代器模式中提出的，要为某个菜单添加子菜单。同时还能够让迭代器生效，这里<br>
 * 就提出新的解决方法：使用组合模式。说白了，就是把模型给抽象树型结构，但是对于结点如何定义<br>
 * 才是关键。也就是如何设计的问题了。
 * 
 * 组合模式用单一责任设计原则换取透明性，对于 client 来说，叶子结点或者组合结点是没有任何区别的。
 * 
 * MenuComponent 是一个菜单的树状结构结点定义，用抽象类完成。其中包含菜单项和菜单两种，<br>
 * 菜单项作为叶子结点，没有孩子结点；菜单作为非叶子结点出现，所以没有价钱、是否为素食之类的判断。<br>
 * 按理说这块和第一章叶子遇到的问题一样，就是不该有的操作都放在抽象类中了，但是在这里这么做的原因是:<br>
 * 
 * 设计的折衷。组合模式可能有不止一种指责，违背了一个类一个指责的高内聚原则，但是对于客户来说，组合内部的操作<br>
 * 都完全透明，对用户可见的就是一个拥有全部操作的接口，而如果按照单一指责原则来设计的话，可能不止一个接口，这对于<br>
 * 客户就需要if...else...去判断使用哪个接口。所以，要具体问题具体分析。
 * 
 * @author niushuai
 *
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegeterian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
