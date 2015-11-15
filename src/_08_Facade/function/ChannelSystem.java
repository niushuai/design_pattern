package _08_Facade.function;

/**
 * 频道控制系统
 */
public class ChannelSystem {

    public void select(String channel) {
        System.out.println("您选择的是: " + channel + "...");
    }

    public void next() {
        System.out.println("下一频道");
    }

    public void prev() {
        System.out.println("上一频道");
    }
}