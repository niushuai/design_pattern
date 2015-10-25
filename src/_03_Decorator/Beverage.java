package _03_Decorator;

/**
 * 星巴克咖啡馆里面的咖啡饮料抽象类
 * 
 * 另外得吐槽一下，星巴克不分大中小，而是分中大超大，简直丧心病狂。
 * 
 * 中杯一般30，大杯33，超大杯36？忘了= =
 * 
 * @author niushuai
 *
 */
public abstract class Beverage {
    // 饮料类型（摩卡、星冰乐、拿铁等等）
    public String description;

    public String getDescription() {
        return description;
    }

    // 饮料的价钱
    public abstract Double cost();
}
