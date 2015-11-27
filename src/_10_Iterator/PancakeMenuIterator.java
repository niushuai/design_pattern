package _10_Iterator;

import java.util.ArrayList;

/**
 * 煎饼屋迭代器类
 * 
 * @author niushuai
 *
 */
public class PancakeMenuIterator implements Iterator {

    ArrayList<MenuItem> items;
    int index = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.size() || items.get(index) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return items.get(index++);
    }

}
