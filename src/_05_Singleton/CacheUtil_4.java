package _05_Singleton;

/**
 * 仔细看getInstance 为啥要判断2次 null 呢？
 * 
 * 如果刚开始有2个线程进入getInstance，刚开始嘛，都是 null，于是某一个获得锁，另一个等待锁<br>
 * 那么，如果临界区中没有判断空的，第一个 new 完正常退出，而第二个已经进入第一层，所以进入临界区<br>
 * 直接又 new 了一个实例，现在就有2个了，就不是单例了。
 * 
 * 所以，极端情况是，刚开始多少个线程进入第一层的 if(cacheUtil == null)，系统就会有多少个实例。<br>
 * 而在临界区里面加一层判断的话，就不会出现问题了。所以这个代码很经典！！！！
 * 
 * @author niushuai
 *
 */
public class CacheUtil_4 {

    private volatile static CacheUtil_4 cacheUtil;

    private CacheUtil_4() {

    }

    public static CacheUtil_4 getInstance() {
        if (cacheUtil == null) {
            synchronized (CacheUtil_4.class) {
                if (cacheUtil == null) {
                    cacheUtil = new CacheUtil_4();
                }
            }
        }

        return cacheUtil;
    }
}
