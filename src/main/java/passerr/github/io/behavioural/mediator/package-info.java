/**
 * 中介者模式<BR/>
 * <p>
 * 用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 * 从而使耦合松散，而且可以独立地改变它们之间的交互。
 * 通过使用一个中间对象来进行消息分发以及减少类之间的直接依赖。
 * </p>
 * <ul>
 * <li>
 * {@link java.util.Timer#schedule(java.util.TimerTask, java.util.Date)}
 * </li>
 * <li>
 * {@link java.util.concurrent.Executor#execute(java.lang.Runnable)}
 * </li>
 * <li>
 * {@link java.util.concurrent.ExecutorService#submit(java.util.concurrent.Callable)}
 * </li>
 * <li>
 * {@link java.lang.reflect.Method#invoke(java.lang.Object, java.lang.Object...)}
 * </li>
 * <li>
 *     生产者消费者问题
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/11 15:03
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.behavioural.mediator;