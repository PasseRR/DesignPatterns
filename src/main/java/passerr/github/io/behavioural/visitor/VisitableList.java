package passerr.github.io.behavioural.visitor;

import passerr.github.io.behavioural.iterator.MyList;

/**
 * @author xiehai1
 * @date 2017/08/29 13:51
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class VisitableList<T> extends MyList<T>{
    /**
     * 类似forEach 实现自己的访问者
     * @param visitable 访问者
     */
    public void visitEach(Visitable<? super T> visitable) {
        for(T t : this){
            visitable.accept(t);
        }
    }
}
