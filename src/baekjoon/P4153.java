package baekjoon;

import java.util.*;

public class P4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 & b == 0 & c == 0) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            Collections.sort(list);
            if (pythagoras(list)) {
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }

    public static boolean pythagoras(List<Integer> list) {
        int a = list.get(0) * list.get(0);
        int b = list.get(1) * list.get(1);
        int c = list.get(2) * list.get(2);
        if (c == a + b) {
            return true;
        }
        return false;
    }
}
