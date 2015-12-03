package _13_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现一个动态代理
 * 
 * @author niushuai
 *
 */
public class LogInterceptor implements InvocationHandler {

    private Object target;

    public LogInterceptor(Object target) {
        this.target = target;
    }

    public void beforeMethod(Method method) {
        System.out.println(method.getName() + " start...");
    }

    public void endMethod(Method method) {
        System.out.println(method.getName() + " end...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(method);
        method.invoke(target, args);
        endMethod(method);
        return null;
    }

}
