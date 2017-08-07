/**
 * 享元模式
 * <p>
 * 享元模式以共享的方式高效地支持大量的细粒度对象，包括内部状态和外部状态。<BR/>
 * 内部状态是存储在享元对象内部的，并且是不会随环境的改变而有所不同。因此，一个享元可以具有内部状态并可以共享。<BR/>
 * 外部状态是随环境的改变而改变的、不可以共享的。享元对象的外部状态必须由客户端保存，并在享元对象被创建之后，
 * 在需要使用的时候再传入到享元对象内部。外部状态不可以影响享元对象的内部状态，它们是相互独立的。
 * </p>
 * <ul>
 * <li>
 *     {@link java.lang.Integer#valueOf(int)}
 * </li>
 * <li>
 *     {@link java.lang.Byte#valueOf(byte)}
 * </li>
 * <li>
 *     String常量池
 * </li>
 * <li>
 *     数据库连接池、线程池
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/07 10:32
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.structural.flyweight;