package passerr.github.io.behavioural.composite;

/**
 * @author xiehai1
 * @date 2017/07/14 13:28
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public boolean add(T data) {
        final Node<T> last = this.tail;
        final Node<T> current = new Node<>(last, data, null);
        this.tail = current;
        if (this.head == null) {
            this.head = current;
        } else {
            last.next = current;
        }
        this.size++;
        return true;
    }

    public T get(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head;
        for(int i = 0; i < index; i ++){
            node = node.next;
        }

        return node.data;
    }

    public boolean remove(T data) {
        for (Node<T> i = this.head; i != null; i = i.next) {
            if ((data == null && i.data == null)
                || (data != null && data.equals(i.data))) {
                final Node<T> previous = i.previous;
                final Node<T> next = i.next;
                if(previous == null){
                    this.head = next;
                }else{
                    previous.next = next;
                    i.previous = null;
                }

                if(next == null){
                    this.tail = previous;
                }else{
                    next.previous = previous;
                    i.next = null;
                }
                i.data = null;
                this.size --;
                return true;
            }
        }

        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
