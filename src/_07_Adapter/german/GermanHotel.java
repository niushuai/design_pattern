package _07_Adapter.german;

/**
 * 德国宾馆使用的是德国标准的插座
 * 
 * @author niushuai
 *
 */
public class GermanHotel {
    GermanSocket socket;

    public GermanHotel(GermanSocket socket) {
        this.socket = socket;
    }

    public void setSocket(GermanSocket socket) {
        this.socket = socket;
    }

    public void charge() {
        socket.charge();
    }
}
