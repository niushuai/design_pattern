package _10_Iterator;

import java.util.ArrayList;

/**
 * 煎饼屋菜单
 * 
 * @author niushuai
 *
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("山东煎饼果子", "里面有薄脆...", Boolean.TRUE, 5);
        addItem("东北煎饼果子", "我的最爱!!加牛肉粒！加火腿肠！双蛋！", Boolean.FALSE, 10);
        addItem("煎饼", "吃起来跟纸似的...", Boolean.TRUE, 3);
        addItem("黄太吉", "名字貌似很流弊，吃起来呵呵呵", Boolean.TRUE, 15);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator getMenuIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
