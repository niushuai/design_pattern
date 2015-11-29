package _11_Composite;

import java.util.Iterator;

/**
 * client 更加简单了，而且对于 printMenu 来说，无论你加入多少 Menu 或者拓展多少新 Menu，对于<br>
 * client 来说都是透明的，首先它可以动态扩展（使用 ArrayList 保存菜单），其次打印的时候更加灵活，<br>
 * 使用组合模式构建的树形结构有很好的扩展性。
 * 
 * @author niushuai
 *
 */
public class Waitness {
    MenuComponent allMenus;

    public Waitness(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印所有的组合。或许还可以实现一个函数：打印某个指定的结点
     */
    public void printMenu() {
        allMenus.print();
    }

    /**
     * 可以用一种方式来迭代所有的菜单和菜单项。这里相当于无区分组合或者叶子
     */
    public void loveVegetarian() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof MenuItem && menuComponent.isVegeterian()) {
                menuComponent.print();
            }
        }
    }
}
