package _10_Iterator;

/**
 * 餐厅菜单
 * 
 * @author niushuai
 *
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEM_NUM = 4;
    int index = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEM_NUM];

        addItem("牛排", "反正就是贵...", Boolean.FALSE, 198);
        addItem("蔬菜沙拉", "坑你没商量...", Boolean.TRUE, 98);
        addItem("奶油蜗牛", "越贵越好吃...", Boolean.TRUE, 688);
        addItem("卡布奇诺", "装逼就是好...", Boolean.TRUE, 58);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (index >= MAX_ITEM_NUM) {
            System.err.println("菜单大小超了！！！");
        } else {
            menuItems[index++] = menuItem;
        }
    }

    /**
     * 这里用到了迭代器接口，面向接口编程。而不是原来的返回具体 MenuItem[]
     * 
     * @return
     */
    @Override
    public Iterator getMenuIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
