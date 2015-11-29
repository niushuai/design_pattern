package _11_Composite;

import java.util.Iterator;

/**
 * 菜单项属于树形结构中的叶子，所以对于 add()/remove()这类针对非叶子结点的操作是忽略的。<br>
 * 所以直接复用父类的 UnsupportedOperationException 即可。
 * 
 * @author niushuai
 *
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegeterian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegeterian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    /**
     * 因为 MenuItem 肯定是叶子结点，所以只需要打印基本元素即可。而不需要考虑子结点。而 Menu<br>
     * 既需要考虑打印当前菜单项的信息，也需要打印子结点的信息
     */
    @Override
    public void print() {
        System.out.println(name + "(" + description + ")" + (vegetarian == true ? " | 素食 | " : " | 荤食 | ") + price
                + "元");
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

}
