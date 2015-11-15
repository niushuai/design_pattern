package _07_Adapter.china;

public class ChineseSocketImpl implements ChineseSocket {

    @Override
    public void charge() {
        System.out.println("使用中国标准的三孔进行充电...");
    }

}
