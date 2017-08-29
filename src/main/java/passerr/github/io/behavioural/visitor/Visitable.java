package passerr.github.io.behavioural.visitor;

/**
 * @author xiehai1
 * @date 2017/08/29 13:40
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@FunctionalInterface
public interface Visitable<T> {
    void accept(T t);
}
