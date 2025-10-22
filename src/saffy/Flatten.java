package saffy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Flatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int count=1;
        for (int i = 0; i < 10; i++) {
            int dump = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                x = sc.nextInt();
                arr.add(x);
            }
            for (int j = 0; j < dump; j++) {
                Collections.sort(arr);
                arr.set(0, arr.get(0) + 1);
                arr.set(99, arr.get(99) - 1);
            }
            Collections.sort(arr);
            System.out.println("#" + count + " " + (arr.get(99) - arr.get(0)));
            count++;
        }
    }
}
