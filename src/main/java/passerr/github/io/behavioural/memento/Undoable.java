package passerr.github.io.behavioural.memento;

/**
 * @author xiehai1
 * @date 2017/08/14 10:13
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface Undoable {
    /**
     * 保存快照
     */
    void save();
    /**
     * 还原到最近一次快照
     */
    void undo();
}
