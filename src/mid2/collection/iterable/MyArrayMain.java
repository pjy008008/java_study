package mid2.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        //iterator없이 myArray는 순회가 불가능하다.

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        //iterator를 구현하면 향상된 for문을 사용할 수 있다!
        System.out.println("for-each 사용");
        for (Integer integer : myArray) {
            System.out.println("integer = " + integer);
        }
    }
}
