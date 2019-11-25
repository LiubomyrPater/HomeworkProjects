package ArayList_LinkedList.myArrayList;

public class MyArrayList {

    private Object[] data;
    private Integer last;


    public MyArrayList() {
        this.data = new Object[10];
        this.last = 0;
    }

    public void add(Object o){
        if (data.length == last){
            Object[] data1 = new Object[data.length + data.length/2];
            for (int i = 0; i < data.length; i++) {
                data1[i] = data[i];
            }
            data = data1.clone();
        }
        data[last] = o;
        last += 1;
       // System.out.println(data.length);
    }

    public Integer size(){
        return last;
    }

    public void remove(Integer index){
        if (index >= 0 && index <= last){
            for (int i = 0; i <last - index; i++) {
                data[index] = data[index + 1];
            }
            data[last] = null;
            last -= 1;
        }else {
            System.out.println(new IndexOutOfBoundsException("The index is larger than the ArrayList"));
        }
    }

    public Object get(Integer index){
        Object o = null;
        if (index >= 0 && index <= last){
            o = data[index];
        }else {
            System.out.println(new IndexOutOfBoundsException("The index is larger than the ArrayList"));
        }
        return o;
    }

    public Object[] toArray(){
        Object[] o = new Object[last + 1];
        for (int i = 0; i <(last + 1) ; i++) {
            o[i] = data[i];
        }
        return o;
    }
}
