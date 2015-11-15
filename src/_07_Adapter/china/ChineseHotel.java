package _07_Adapter.china;

/**
 * 中国宾馆使用的是中国标准的插座
 * 
 * @author niushuai
 *
 */
public class ChineseHotel {
    ChineseSocket socket;

    public ChineseHotel(ChineseSocket socket) {
        this.socket = socket;
    }

    public void setSocket(ChineseSocket socket) {
        this.socket = socket;
    }

    public void charge() {
        socket.charge();
    }
}
