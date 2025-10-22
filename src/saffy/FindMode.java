package saffy;

import java.util.Scanner;

public class FindMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for (int i = 0; i < n; i++) {
            int testCase = sc.nextInt();
            int[] arr = new int[101];
            for (int j = 0; j < 1000; j++) {
                x = sc.nextInt();
                arr[x]++;
            }
            int max = 0;
            for (int j = 0; j < 100; j++) {
                if (arr[j] >= arr[max]) {
                    max = j;
                }
            }
            System.out.println("#" + testCase + " " + max);
        }
    }
}
