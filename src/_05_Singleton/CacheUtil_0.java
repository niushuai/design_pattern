package _05_Singleton;

/**
 * 这是我在看书之前就能想到的单例实现方式
 * 
 * 看了书发现有一个问题是：如果实例化cacheUtil = new CacheUtil_0()需要耗费大量的资源，<br>
 * 而且在服务运行过程中又一直没用到（话说这么极端的情况，为啥要初始化。。。没有需求谁会做啊）。那么这本身就是极大的<br>
 * 浪费。所以更合适的办法是懒惰策略：到使用的时候再初始化。
 * 
 * 但我个人看法是，对于web 服务来说，latency的控制是非常必要的。所以在服务初始化就完成所有和“用户无关”部分的工作是<br>
 * 非常有效的。即只要不是和用户相关的东西，就尽量不在 pv 请求里做。
 * 
 * @author niushuai
 *
 */
public class CacheUtil_0 {
    private static CacheUtil_0 cacheUtil;

    private CacheUtil_0() {
        cacheUtil = new CacheUtil_0();
    }

    public static CacheUtil_0 getInstance() {
        return cacheUtil;
    }
}
