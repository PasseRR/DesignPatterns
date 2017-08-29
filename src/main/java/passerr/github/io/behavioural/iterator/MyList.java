package passerr.github.io.behavioural.iterator;

import passerr.github.io.structural.composite.LinkedList;

import java.util.Iterator;

/**
 * @author xiehai1
 * @date 2017/08/11 14:52
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class MyList<T> extends LinkedList<T> implements Iterable<T> {
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this);
    }
}
