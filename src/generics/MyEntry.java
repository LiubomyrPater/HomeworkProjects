package generics;
/**
        Створити клас MyEntry<K,V>.
        Описати в ньому дженеріками – поля, гетери/сетери, toString.
*/
public class MyEntry <K,V> {

    private K some;
    private V any;

    public K getSome() {
        return some;
    }

    public void setSome(K some) {
        this.some = some;
    }

    public V getAny() {
        return any;
    }

    public void setAny(V any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "some=" + some +
                ", any=" + any +
                '}';
    }
}
