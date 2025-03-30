package codingtest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Node> deque = new ArrayDeque<>();
        int n = sc.nextInt();
        int l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x =sc.nextInt();
            while(!deque.isEmpty()&&deque.getLast().value>x){
                deque.removeLast();
            }
            deque.addLast(new Node(i,x));
            if(deque.getFirst().index<i-l+1){
                deque.removeFirst();
            }
            int goodNum = deque.getFirst().value;
            System.out.print(goodNum+" ");
        }
    }

    static class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index=index;
            this.value=value;
        }
    }
}
