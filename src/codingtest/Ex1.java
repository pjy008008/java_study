package codingtest;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int total=0;
        String str = scanner.nextLine();
        for(int i=0;i<n;i++){
            char x = str.charAt(i);
            int k = x-'0';
            total+=k;
        }
        System.out.println(total);
    }
}
