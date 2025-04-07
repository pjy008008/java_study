package mid2.collection.array;

import java.util.Arrays;

public class MyArrayListV4 <E> {
    private static final int DEFAULT_CAPACITY=5;
    private Object[] elementData;
    private int size=0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E a) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++]=a;
    }

    //코드 추가
    public void add(int index, E obj) {
        if (size == elementData.length) {
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index]=obj;
        size++;
    }
    //코드 추가
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData,newCapacity);
    }
    /** @noinspection unchecked*/
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size]=null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData,size))+
                " size="+size+", capacity="+elementData.length;
    }
}
