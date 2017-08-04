package passerr.github.io.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理只能代理接口实现方法 类方法不能代理
 * <p>
 * {@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)}生成代理对象
 * <ol>
 * <li>
 *     {@link sun.misc.ProxyGenerator#generateProxyClass(String, Class[])}根据代理类名和接口生成代理类字节码
 * </li>
 * <li>
 * 根据ClassLoader和接口获得接口方法列表生成代理类的字节码, 并返回代理类的Class {@link Proxy#getProxyClass(ClassLoader, Class[])}
 * </li>
 * <li>
 * 根据&lt;2&gt;中的class获得代理实例{@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)}
 * </li>
 * </ol>
 * </p>
 * @author xiehai1
 * @date 2017/08/04 12:27
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
            this.target.getClass().getClassLoader(),
            this.target.getClass().getInterfaces(),
            this
        );
    }
}
