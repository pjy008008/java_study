package saffy;

import java.util.Scanner;

public class StringFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int testCase = sc.nextInt();
            sc.nextLine();
            int index = 0;
            int count = 0;
            String substring = sc.nextLine();
            String string = sc.nextLine();
            while (true) {
                index = string.indexOf(substring, index);
                if (index == -1) {
                    break;
                }
                count++;
                index++;
            }
            System.out.println("#" + testCase + " " + count);
        }
    }
}
