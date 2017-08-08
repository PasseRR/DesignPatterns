package passerr.github.io.behavioural.command;

/**
 * 命令接口
 * @author xiehai1
 * @date 2017/08/08 14:28
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@FunctionalInterface
public interface Command<T> {
    T execute();
}
