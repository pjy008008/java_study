package baekjoon;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int sum = i;
            int number = i;
            while(true){
                if (number < 10) {
                    sum += number;
                    break;
                }
                sum += number % 10;
                number /= 10;
            }
            if (sum == n) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}