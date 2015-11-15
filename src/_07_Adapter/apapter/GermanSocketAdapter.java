package _07_Adapter.apapter;

import _07_Adapter.china.ChineseSocket;
import _07_Adapter.german.GermanSocket;

/**
 * 德国插座的适配器
 * 
 * 这里使用的是组合的方式，并且组合也使用的是面向接口编程。我只想说“完~~~~~美！！”
 * 
 * @author niushuai
 *
 */
public class GermanSocketAdapter implements GermanSocket {

    private ChineseSocket socket;

    public GermanSocketAdapter(ChineseSocket socket) {
        this.socket = socket;
    }

    @Override
    public void charge() {
        socket.charge();
    }

}
