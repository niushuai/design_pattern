package _05_Singleton;

/**
 * 这个版本的解决方案和我没看书之前的版本是一样的，就是初始化类的时候就创建单例，<br>
 * JVM 会保证这个实例在使用前一定会被初始化好，而且不存在多线程问题。
 * 
 * 我看过的项目中，也有很多是这样使用的。简单方便
 * 
 * @author niushuai
 *
 */
public class CacheUtil_3 {

    private static CacheUtil_3 cacheUtil = new CacheUtil_3();

    private CacheUtil_3() {

    }

    public static CacheUtil_3 getInstance() {
        return cacheUtil;
    }
}
