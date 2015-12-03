package _13_Proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式用到的地方太多了，这里仅仅实现一个动态代理，其他的还有 RMI，DBProxy，翻墙代理等等等等<br>
 * 
 * 这里我想说的是，最好把 jdk 的动态代理原理搞清楚，比如 Proxy 是如何实现的，接口和类有什么区别<br>
 * （一个是实现所有接口，一个是更改字节码），还有 InvocationHandler 里面的 invoke 中，proxy 和 target<br>
 * 都是干嘛的，从代理进来后是如何到达 InvocationHandler，后续如何处理等等。搞清楚以后才能说懂了动态代理。
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        LogInterceptor interceptor = new LogInterceptor(userDAO);
        UserDAO proxy =
                (UserDAO) Proxy.newProxyInstance(UserDAO.class.getClassLoader(), userDAO.getClass().getInterfaces(),
                        interceptor);

        proxy.saveUser(new User("鸣人", 10086, 18));
    }
}
