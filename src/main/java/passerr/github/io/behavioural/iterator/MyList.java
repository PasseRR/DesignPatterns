package passerr.github.io.behavioural.iterator;

import passerr.github.io.structural.composite.LinkedList;

/**
 * @author xiehai1
 * @date 2017/08/11 14:52
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class MyList<T> extends LinkedList<T> {
    public MyIterator<T> iterator(){
        return new MyIterator<>(this);
    }
}
