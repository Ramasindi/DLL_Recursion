//************ Total Marks for Node class: 12 marks
public class Node<T> {
    T element;
    Node<T> next;
    Node<T> prev;
    
    public Node(Node<T> next, Node<T> prev, T element) {
        this.next = next;
        this.prev = prev;
        this.element = element;
    }
    /* (12 marks for accessor and mutator methods)*****************
     */
    public void setElement(T element) {
        this.element = element;
    }
    
    public T getElement() {
        return element;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public Node<T> getPrev() {
        return this.prev;
    }
    
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
    
    public String toString() {
        if (element == null) {
            return "<>";
        }
        return "<" + element.toString() + ">";
    }
}
