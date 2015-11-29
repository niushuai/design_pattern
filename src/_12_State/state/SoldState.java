package _12_State.state;

import _12_State.context.SellerMachine;

/**
 * 购买。可到达的状态：正常出货回到待机状态 or 售罄状态
 * 
 * @author niushuai
 *
 */
public class SoldState implements State {

    private SellerMachine seller;

    public SoldState(SellerMachine seller) {
        this.seller = seller;
    }

    @Override
    public void insert() {
        System.out.println("骚年，稍等。正在给你出货呢，出完货再继续买哈，爱你！");
    }

    @Override
    public void eject() {
        System.out.println("都点了购买按钮，本售货机的东西一经售出，概不退还，不服来咬！");
    }

    @Override
    public void turnCrank() {
        System.out.println("大哥，你按1000次我也只会给你1个的。。。");
    }

    @Override
    public void dispense() {
        if (seller.getCount() > 0) {
            System.out.println("终于出货啦！！！速度来拿");
            seller.setState(seller.getNoQuarterState());
            seller.reduceCount();
        } else {
            System.out.println("sorry，让您等了这么久。。。。但是东西售罄了！！！");
            seller.setState(seller.getSoldOutState());
        }
    }

}
