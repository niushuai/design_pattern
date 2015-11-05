package _05_Singleton;

/**
 * 第一个版本的单例模式
 * 
 * 思考下面getInstance()方法，它竟然不是线程安全的！！！原因自己想
 * 
 * @author niushuai
 *
 */
public class CacheUtil_1 {

    private static CacheUtil_1 cacheUtil;

    private CacheUtil_1() {

    }

    // 非线程安全
    public static CacheUtil_1 getInstance() {
        if (cacheUtil == null) {
            cacheUtil = new CacheUtil_1();
        }

        return cacheUtil;
    }
}
