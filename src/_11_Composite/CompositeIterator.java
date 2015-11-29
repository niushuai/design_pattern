package _11_Composite;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * 组合迭代器。
 * 
 * 状态不是很好，看了快一个小时才迷糊过来。。。。以后得专心点啊，专心看了5分钟就明白了 T_T
 * 
 * 这个迭代器要有堆栈是因为每个结点都有一个迭代器，如果你要全部遍历的话，要么 DFS 要么 BFS，<br>
 * 这里选择的是 DFS。所以当当前结点没有遍历完而又需要进入下层，就要保存当前迭代器所在的位置。于是<br>
 * 用一个栈来保存迭代器（迭代器内部会记录迭代到的位置），这样就可以了。
 * 
 * 当某一个结点下的所有菜单或者菜单项都迭代过了，这个迭代器就失效了，就调用 stack.pop()将这个迭代器从<br>
 * 栈中剔除即可。然后继续遍历上层迭代器的下一个结点。这样就可以遍历整棵树了。
 * 
 * waitness 中 print()方法那么简单是因为它的迭代器是内部的，不需要维护迭代器所在的位置。而外部迭代器需要<br>
 * 保存位置。两者的优劣是：
 * 
 * 内部迭代器：需要不同种类的结点各自实现，如果要更改逻辑，所有涉及的内部迭代器均要修改。<br>
 * 外部迭代器：统一。
 * 
 * @author niushuai
 *
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.add(iterator);
    }

    /**
     * 是否有下一个结点（菜单或者菜单项，反正都是 MenuComponent）
     */
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            // 如果当前结点的 ArrayList 中还有菜单或者菜单项，就返回 true
            if (iterator.hasNext()) {
                return true;
            } else { // 没有的话，说明当前结点的菜单或者菜单项都已经遍历过了，迭代器可以滚粗 stack 了
                stack.pop();
                // 然后继续遍历上一层 ArrayList 的下一个菜单或者菜单项
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            MenuComponent menuComponent = iterator.next();
            // 如果是菜单，就加入到堆栈中。堆栈保存的是组合元素迭代器（本质是保存迭代器迭代到的位置）。
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }

            return menuComponent;
        }

        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }

}
