/**
 * 工厂方法<BR/>
 * <p>
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method 使一个类的实例化延迟到其子类。
 * 返回具体对象的方法
 * </p>
 * <ul>
 *    <li>
 *        {@link java.lang.Integer#valueOf(java.lang.String)}
 *    </li>
 *    <li>
 *        {@link java.lang.reflect.Constructor#newInstance(java.lang.Object...)}
 *    </li>
 *    <li>
 *        {@link java.lang.Class#forName(java.lang.String)}
 *    </li>
 *    <li>
 *        {@link java.lang.reflect.Proxy#newProxyInstance(java.lang.ClassLoader, java.lang.Class[], java.lang.reflect.InvocationHandler)}
 *    </li>
 * </ul>
 * @author xiehai1
 * @date 2017/07/12 21:59
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.creational.factorymethod;