package saffy;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int count=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 2; j < n - 2; j++) {
                int leftMax = Math.max(arr[j - 2], arr[j - 1]);
                int rightMax = Math.max(arr[j + 1], arr[j + 2]);
                int max = Math.max(leftMax, rightMax);
                if (arr[j] > max) {
                    count += arr[j] - max;
                }
            }
            System.out.println("#" + (i + 1) + " " + count);
        }
    }
}
