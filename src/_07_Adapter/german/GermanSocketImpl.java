package _07_Adapter.german;

public class GermanSocketImpl implements GermanSocket {

    @Override
    public void charge() {
        System.out.println("使用德国标准的两孔进行充电...");
    }

}
