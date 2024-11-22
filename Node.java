/**
 * 
 * @author Shaun Khang
 * @param <T> any generic data type
 */
public class Node<T> {

    private T data; // any data type
    private Node<T> next; // the node next to it

    // constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // setter and getters
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }
}