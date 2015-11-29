package _12_State.state;

import java.util.Random;

import _12_State.context.SellerMachine;

/**
 * 投币状态，可到达的状态：退币 or 按购买按钮
 * 
 * @author niushuai
 *
 */
public class HasQuarterState implements State {

    private SellerMachine seller;
    private Random random = new Random(47);

    public HasQuarterState(SellerMachine seller) {
        this.seller = seller;
    }

    @Override
    public void insert() {
        System.out.println("一次只能买1个，谢谢合作...");
    }

    @Override
    public void eject() {
        System.out.println("一个大男人，买个东西犹犹豫豫，退你2块钱，去shi...");
        seller.setState(seller.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("正在准备出货呢，客观稍等，么么哒");
        if (random.nextInt(10) == 8 && seller.getCount() >= 2) {
            seller.setState(seller.getWinnerState());
        } else {
            seller.setState(seller.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("亲，得按按钮才能出货，你说你想看我自动出货？呵呵，一眼万年。");
    }

}
