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

    // 思考一下，这里又什么坏处？答案是违反了“对修改关闭，对扩展开放”的原则。如果还有一个新的<br>
    // 菜单，那么打印菜单这里就还是需要修改。最简单的方式是使用一个 ArrayList 支持拓展，但更好的方式<br>
    // 是下面将要学习的——组合模式
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
