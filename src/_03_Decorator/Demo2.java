package _03_Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 万万没想到，InputStream 就是应用装饰者模式的一个典范啊。。。。
 * 
 * @author niushuai
 *
 */
public class Demo2 extends FilterInputStream {

    protected Demo2(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int c;
        try {
            // 看见没，装饰者模式装饰了3层！
            InputStream in = new Demo2(new BufferedInputStream(new FileInputStream("src/_03_Decorator/demo2.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println();

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
