package passerr.github.io.behavioural.composite;

/**
 * @author xiehai1
 * @date 2017/07/14 13:27
 * @Copyright(c) gome inc Gome Co.,LTD
 */
class Node<T> {
    protected Node<T> previous;
    protected T data;
    protected Node<T> next;
    public Node(Node<T> previous, T data, Node<T> next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
