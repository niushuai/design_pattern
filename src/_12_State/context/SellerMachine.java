package _12_State.context;

import _12_State.state.HasQuarterState;
import _12_State.state.NoQuarterState;
import _12_State.state.SoldOutState;
import _12_State.state.SoldState;
import _12_State.state.State;
import _12_State.state.WinnerState;

/**
 * 自动售货机，目前比较 low。只能卖一样东西。。。。（一个 demo 要啥自行车！！！）
 * 
 * @author niushuai
 *
 */
public class SellerMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    // 售卖物品的数量
    int count = 0;

    private State currentState = soldOutState;

    public SellerMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        // 当供货后，售货机状态为待机状态（等待投币动作）
        if (count > 0) {
            currentState = noQuarterState;
        }
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insert() {
        currentState.insert();
    }

    public void eject() {
        currentState.eject();
    }

    /**
     * 注意：这里不是将 dispense 单独出来，因为对于 client 来说，是无法感知这个动作的。
     */
    public void turnCrank() {
        currentState.turnCrank();
        // 所以当成是 turnCrank 的内部调用即可。但是最好是加个状态判断，如果一切正常的情况才会调用 dispense
        // 不然调用 dispense 就是不恰当的（没付钱的情况按按钮也会出货？！）
        if (getCurrentState() == getSoldState() || getCurrentState() == getWinnerState()) {
            currentState.dispense();
        }
    }

    public void reduceCount() {
        if (count != 0) {
            count -= 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    // 这个是退币操作需要的，你得知道上一个状态，才能知道是需要退币还是客户的无理取闹。。。
    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

}
