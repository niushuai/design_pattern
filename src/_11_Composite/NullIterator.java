package _11_Composite;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 空迭代器实现。
 * 
 * 这里引出了空对象设计模式：如何返回一个 null，那么client 就需要特别针对 Null 进行编程<br>
 * 如果我返回的是一个空的迭代器（就是里面hasNext 肯定为 faluse），那么 client 就无须考虑<br>
 * 迭代器的不同形态，而是统一、透明对待所有迭代器。
 * 
 * 不仅代码简单，以后修改起来也非常方便。而且 Null 的应用在代码中非常非常非常普遍。
 * 
 * @author niushuai
 *
 */
@SuppressWarnings("rawtypes")
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void forEachRemaining(Consumer action) {
    }

}
