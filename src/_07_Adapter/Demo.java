package _07_Adapter;

import _07_Adapter.apapter.GermanSocketAdapter;
import _07_Adapter.china.ChineseHotel;
import _07_Adapter.china.ChineseSocket;
import _07_Adapter.china.ChineseSocketImpl;
import _07_Adapter.german.GermanHotel;
import _07_Adapter.german.GermanSocket;
import _07_Adapter.german.GermanSocketImpl;

public class Demo {
    public static void main(String[] args) {
        GermanSocket germanSocket = new GermanSocketImpl();
        GermanHotel germanHotel = new GermanHotel(germanSocket);

        System.out.println("德国人在德国住宾馆时...");
        germanHotel.charge();

        System.out.println();

        ChineseSocket chinaSocket = new ChineseSocketImpl();
        ChineseHotel chinaHotel = new ChineseHotel(chinaSocket);

        System.out.println("中国人在中国住宾馆时...");
        chinaHotel.charge();

        System.out.println();

        System.out.println("中国人出差到德国...");
        System.out.println("拿出自己的适配器，将中国插座插到适配器上...");
        GermanSocketAdapter adapter = new GermanSocketAdapter(chinaSocket);
        System.out.println("然后插到德国宾馆的插座上...");
        germanHotel.setSocket(adapter);
        germanHotel.charge();
    }
}
