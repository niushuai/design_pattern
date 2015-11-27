package _10_Iterator;


/**
 * 服务员类。虽然餐厅菜单项目不一样。但是应用迭代器设计模式以后就被解耦了
 * 
 * @author niushuai
 *
 */
public class Waitness {
    Menu pancake;
    Menu diner;

    // 复制哪几个菜单
    public Waitness(Menu pancake, Menu diner) {
        this.pancake = pancake;
        this.diner = diner;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancake.getMenuIterator();
        Iterator dinerIterator = diner.getMenuIterator();

        System.out.println("早餐如下：");
        printMenu(pancakeIterator);

        System.out.println();

        System.out.println("午餐如下：");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.name + "(" + item.description + ")"
                    + (item.vegetarian == true ? " | 素食 | " : " | 荤食 | ") + item.price + "元");
        }
    }
}
