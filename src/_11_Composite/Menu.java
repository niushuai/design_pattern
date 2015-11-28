package _11_Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 这里主要看 print 方法的实现
 * 
 * @author niushuai
 *
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
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
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    /**
     * 这里要实现的是，不仅能打印全部结点的信息，也能打印某个子节点的信息。所以自然而然使用<br>
     * 递归实现，迭代器+递归
     */
    @Override
    public void print() {
        System.out.println("菜单： " + name + "(" + description + ")");
        System.out.println("==========");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();

        }
    }

}
