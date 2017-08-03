/**
 * Facade（外观模式）<BR/>
 * <p>
 * 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * </p>
 * <ul>
 * <li>
 * 常见于controller、service、dao，在controller直接与service交互，service为高层接口,dao为子系统。
 * </li>
 * <li>
 * 日志log4j等
 * </li>
 * </ul>
 *
 * @author xiehai1
 * @date 2017/07/14 14:40
 * @Copyright(c) gome inc Gome Co.,LTD
 */
package passerr.github.io.structural.facade;