package _14_Compound.composite;

import java.util.ArrayList;
import java.util.Iterator;

import _14_Compound.duckentity.Quackable;

/**
 * 这里又用到组合模式管理鸭子集合。
 * 
 * 还记得组合模式吗？如果用到整体、局部保持一致的情况，记得使用组合模式。组合模式的缺点是<br>
 * 叶子有些操作是冗余的，只有父节点才能进行。但是对客户来说，整体和局部都可以统一对待，无须使用多个接口来进行操作。
 * 
 * @author niushuai
 *
 */
public class Flock implements Quackable {

    private ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> it = ducks.iterator();
        while (it.hasNext()) {
            Quackable duck = it.next();
            duck.quack();
        }
    }

}
