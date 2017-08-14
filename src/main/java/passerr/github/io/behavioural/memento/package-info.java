/**
 * 备忘录模式<BR/>
 * <p>
 * 备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是一个用来存储另外一个对象内部状态的快照的对象，
 * 备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，
 * 从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
 * </p>
 * <ul>
 * <li>
 * {@link java.util.Date} Date对象通过自身内部的一个long值来实现备忘录模式
 * </li>
 * <li>
 * 所有实现{@link java.io.Serializable}接口的类
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/11 18:26
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.behavioural.memento;