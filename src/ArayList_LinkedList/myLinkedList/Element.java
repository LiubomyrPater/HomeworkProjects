package ArayList_LinkedList.myLinkedList;

public class Element {

    private Object value;
    private Element prev;
    private Element next;


    public Element(Object value, Element prev, Element next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

}
