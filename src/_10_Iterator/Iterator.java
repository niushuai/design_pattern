package _10_Iterator;

/**
 * 迭代器接口。 有没有考虑多线程乱入的情况呢？
 * 
 * @author niushuai
 *
 */
public interface Iterator {

    boolean hasNext();

    Object next();
}
