package passerr.github.io.behavioural.iterator;

import passerr.github.io.structural.composite.LinkedList;

import java.util.Iterator;

/**
 * @author xiehai1
 * @date 2017/08/11 14:51
 * @Copyright(c) gome inc Gome Co.,LTD
 */
class MyIterator<T> implements Iterator<T> {
    private LinkedList<T> list;
    private int index;

    MyIterator(LinkedList<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size();
    }

    @Override
    public T next() {
        return this.list.get(this.index ++);
    }
}
