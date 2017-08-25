/**
 * 模板方法模式
 * <p>
 * 准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，
 * 然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，
 * 从而对剩余的逻辑有不同的实现。
 * 让子类可以重写方法的一部分，而不是整个重写，你可以控制子类需要重写那些操作。
 * </p>
 * <ul>
 * <li>
 * {@link java.util.AbstractCollection#iterator()}
 * {@link java.util.AbstractCollection#size()}
 * </li>
 * <li>
 * {@link java.util.Collections#sort(java.util.List, java.util.Comparator)}
 * </li>
 * <li>
 * {@link java.io.InputStream#read()}
 * </li>
 * <li>
 *  spring service事务拦截 service就是模板方法
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/25 17:27
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.behavioural.templatemethod;