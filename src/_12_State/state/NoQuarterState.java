package _12_State.state;

import _12_State.context.SellerMachine;

/**
 * 未投币状态。也就是初始状态，可到达的状态：投币
 * 
 * @author niushuai
 *
 */
public class NoQuarterState implements State {

    private SellerMachine seller;

    public NoQuarterState(SellerMachine seller) {
        this.seller = seller;
    }

    @Override
    public void insert() {
        System.out.println("投入2元硬币...");
        seller.setState(seller.getHasQuarterState());
    }

    @Override
    public void eject() {
        System.out.println("没投币就想退币？？？心累，已报警。");
    }

    @Override
    public void turnCrank() {
        System.out.println("不投币你按个毛线啊！！！深井冰");
    }

    @Override
    public void dispense() {
        System.out.println("我只想问：投币了吗？你们这群人真是醉了...");
    }

}
