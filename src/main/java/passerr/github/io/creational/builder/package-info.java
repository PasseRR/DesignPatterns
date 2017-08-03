/**
 * 建造者<BR/>
 * <p>
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 在《Effective Java》书中第二条，就提到“遇到多个构造器参数时要考虑用构建器”。
 * </p>
 * <ul>
 * <li>
 * {@link java.lang.StringBuilder#append(boolean)}
 * </li>
 * <li>
 * {@link java.lang.StringBuffer#append(boolean)}
 * </li>
 * <li>
 * {@link java.sql.PreparedStatement#setObject(int, java.lang.Object)}
 * </li>
 * </ul>
 *
 * @author xiehai1
 * @date 2017/07/13 09:31
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.creational.builder;