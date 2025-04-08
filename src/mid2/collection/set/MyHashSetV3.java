package mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3 <E> implements MySet <E> {
    static final int DEFAULT_INITIAL_CAPACITY=16;
    private LinkedList<E>[] buckets;
    private int size=0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }
    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public boolean add(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(e)) {
            return false;
        }
        bucket.add(e);
        size++;
        return true;
    }
    public boolean contains(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(e);
    }
    public boolean remove(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(e);
        if (result) {
            size--;
            return true;
        }else {
            return false;
        }
    }
    private int hashIndex(Object e) {
        return Math.abs(e.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}
