/**
 * 命令模式<BR/>
 * <p>
 * 命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，
 * 对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * </p>
 * <ul>
 * <li>
 * {@link java.util.concurrent.ExecutorService#execute(java.lang.Runnable)}
 * </li>
 * <li>
 * {@link java.util.concurrent.ExecutorService#submit(java.util.concurrent.Callable)}
 * </li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/08 11:44
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.behavioural.command;