package _05_Singleton;

/**
 * 然后接下来的几个版本都是修复 CacheUtil_2中引入的问题：
 * <p>
 * 
 * 多线程安全
 * <p>
 * 
 * 这个版本通过同步方式来实现，就是用 synchronized。但是我们思考一下就会发现，<br>
 * 加上关键字以后，只有第一次访问时候加锁才有用（即创建一个单例），以后所有的访问都不会存在多线程问题<br>
 * 但是被同步锁搞的只能串行使用。这就大大降低了性能。
 * 
 * 当然，如果你觉得这点性能对于整个系统没有影响，这应该是最稳妥、简单的方案了。程序不会出现正确性问题，只是性能会有很大的损耗。
 * 
 * @author niushuai
 *
 */
public class CacheUtil_2 {

    private static CacheUtil_2 cacheUtil;

    private CacheUtil_2() {

    }

    // 对方法加锁后，就线程安全了。更进一步，是否只对 new 的那一步加锁？因为就是创建实例的时候会
    // 出现多线程问题嘛，所以 CacheUtil_4就是那么搞的。。
    public static synchronized CacheUtil_2 getInstance() {
        if (cacheUtil == null) {
            cacheUtil = new CacheUtil_2();
        }

        return cacheUtil;
    }
}
