package mid2.collection.utils;

import java.util.*;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class = " + list.getClass());
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        //MultiThread상황에서 문제가 없게 할 수 있다.
        System.out.println("synchronizedList = " + synchronizedList.getClass());
        Queue<Integer> deque = new PriorityQueue<>();
    }
}
