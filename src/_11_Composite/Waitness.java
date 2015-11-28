package _11_Composite;

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

    public void printMenu() {
        allMenus.print();
    }
}
