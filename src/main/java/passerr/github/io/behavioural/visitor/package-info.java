/**
 * 访问者模式
 * <p>
 * 访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。
 * 一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 * </p>
 * <ul>
 * <li>
 * {@link java.util.function.Consumer} {@link java.util.List#forEach(java.util.function.Consumer)}
 * <BR/>
 * {@link java.util.function.BiConsumer} {@link java.util.Map#forEach(java.util.function.BiConsumer)}
 * <BR/>
 * {@link java.util.function.BiFunction} {@link java.util.Map#replaceAll(java.util.function.BiFunction)}
 * </li>
 * <li>
 * {@link javax.lang.model.element.AnnotationValue} {@link javax.lang.model.element.AnnotationValueVisitor}
 * <BR/>
 * {@link javax.lang.model.element.Element} {@link javax.lang.model.element.ElementVisitor}
 * <BR/>
 * {@link javax.lang.model.type.TypeMirror} {@link javax.lang.model.type.TypeVisitor}
 * </li>
 * <li>
 * {@link java.nio.file.FileVisitor} {@link java.nio.file.SimpleFileVisitor}
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/25 18:16
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.behavioural.visitor;