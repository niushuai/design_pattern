package _12_State.state;

import _12_State.context.SellerMachine;

/**
 * 和 SoldState 同级的层级。为什么没放到一个类中？因为要符合的是高内聚，一个<br>
 * 类最好只有一个操作，这样以后概率升级才不会影响到其他功能。
 * 
 * @author niushuai
 *
 */
public class WinnerState implements State {

    private SellerMachine seller;

    public WinnerState(SellerMachine seller) {
        this.seller = seller;
    }

    @Override
    public void insert() {
        System.out.println("抱歉，行贿也无法让你拥有好运气！");
    }

    @Override
    public void eject() {
        System.out.println("给钱也得不到我，还特么想跟我要钱？负分滚粗");
    }

    @Override
    public void turnCrank() {
        System.out.println("呵呵，你再按500年我给你一次机会吧。。");
    }

    @Override
    public void dispense() {
        System.out.println("乖乖，真是厉害啊。。。运气好的不行啊，赶紧去买彩票吧！");
        seller.reduceCount();
        seller.reduceCount();
        if (seller.getCount() > 0) {
            seller.setState(seller.getNoQuarterState());
        } else {
            seller.setState(seller.getSoldOutState());
        }

    }

}
