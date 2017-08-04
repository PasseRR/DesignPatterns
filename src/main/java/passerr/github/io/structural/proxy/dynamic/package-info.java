/**
 * <p>
 * 动态代理分为jdk动态代理和cglib动态代理
 * <ul>
 * <li>
 * jdk动态代理通过反射类Proxy和InvocationHandler回调接口实现，
 * 要求委托类必须实现一个接口，只能对该类接口中定义的方法实现代理，这在实际编程中有一定的局限性。
 * </li>
 * <li>
 * cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，
 * 并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
 * </li>
 * </ul>
 * </p>
 * @author xiehai1
 * @date 2017/08/04 11:19
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.structural.proxy.dynamic;