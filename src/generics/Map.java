package generics;

import java.util.*;
/**
     3. Створити клас Map<K,V>.
        Реалізвати в даному класі методи, які б:

        Додавали новий об’єкт в мапу
        Видаляли об’єкт мапи за ключем
        Видаляли об’єкт мапи за значенням
        Виводили на екран Set ключів
        Виводили на екран List значень
        Виводили на екран цілу мапу
 */
public class Map <K,V> {

    private TreeSet<K> keys;
    private ArrayList<V> values;

    public Map() {
        this.keys = new TreeSet<>();
        this.values = new ArrayList<>();
    }

    public void put(K key, V value){
        this.keys.add(key);
        Iterator<K> iterator = this.keys.iterator();
        int number = -1;
        while (iterator.hasNext()){
            number ++;
            if (iterator.next().equals(key)){
                break;
            }
        }

        if (this.values.size() != 0){
            System.out.println(number);
            this.values.remove(number);
        }
        this.values.add(number, value);// елемент не затирається , а розширяється список
    }

    public void removeByKey(K key){
        Iterator<K> iterator = this.keys.iterator();
        int number = -1;
        while (iterator.hasNext()){
            number ++;
            if (iterator.next().equals(key)){
                break;
            }
        }
        this.keys.remove(key);
        this.values.remove(number);
    }

    public void removeByValue(V value){
    }

    public TreeSet keySet(){
        return this.keys;
    }

    public ArrayList valueList(){
        return this.values;
    }

    public ArrayList allMap(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        Iterator<K> iterator = this.keys.iterator();
        int number = -1;
        while(iterator.hasNext()){
            number ++;
            stringArrayList.add(iterator.next().toString() + "=" + this.values.get(number).toString());
        }
        return stringArrayList;
    }
}
