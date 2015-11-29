package _12_State.state;

import _12_State.context.SellerMachine;

/**
 * 售罄。以后扩展可以通过补货到达待机状态
 * 
 * @author niushuai
 *
 */
public class SoldOutState implements State {

    private SellerMachine seller;

    public SoldOutState(SellerMachine seller) {
        this.seller = seller;
    }

    @Override
    public void insert() {
        System.out.println("没货了，还投币搞毛线啊。眼瞎啊。。。");
    }

    @Override
    public void eject() {
        System.out.println("来，爷赏你2块钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("别按了，你又不会补货。。。");
    }

    @Override
    public void dispense() {
        System.out.println("哥哥，真没货了。。不然我真想多坑你，不是，多服务你几次呢。。。");
    }

}
