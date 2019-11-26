package ArayList_LinkedList.myLinkedList;

public class MyLinkedList {

    private Element head;
    private Element tail;



    public void addHead(Element element) {
        if (head == null && tail == null){
            head = tail = element;
        }else {
            element.setNext(head);
            head.setPrev(element);
            head = element;
        }
    }


    public void addTail(Element element) {
        if (head == null && tail == null){
            head = tail = element;
        }else {
            element.setPrev(tail);
            tail.setNext(element);
            tail = element;
        }
    }


    public Object getHead() {
        return head.getValue();
    }


    public Object getTail() {
        return tail.getValue();
    }



}
