package _10_Iterator;

/**
 * 餐厅菜单迭代器,实现了迭代器接口。这样服务员遍历的时候就不需要知道内部是如何实现 hasNext()和 next()
 * 
 * @author niushuai
 *
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int index = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.length || items[index] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return items[index++];
    }

}
