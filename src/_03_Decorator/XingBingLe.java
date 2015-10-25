package _03_Decorator;

/**
 * 我爱喝星冰乐！所以果断要超大杯啊啊啊啊啊啊
 * 
 * @author niushuai
 *
 */
public class XingBingLe extends Beverage {

    public XingBingLe() {
        description = "星冰乐";
    }

    @Override
    public Double cost() {
        return 36.00;
    }

}
