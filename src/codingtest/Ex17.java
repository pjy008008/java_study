package codingtest;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        int[] arr = new int[size];
        int max,temp;
        for (int i = 0; i < size; i++) {
            arr[i]=Integer.parseInt(str.substring(i,i+1));
        }
        for (int i = 0; i < size; i++) {
            max=i;
            for (int j = i+1; j < size; j++) {
                if (arr[max] < arr[j]) {
                    max=j;
                }
            }
            temp = arr[max];
            arr[max]=arr[i];
            arr[i] = temp;
            System.out.print(arr[i]);
        }
    }
}
