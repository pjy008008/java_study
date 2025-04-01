package codingtest;

import java.util.Scanner;

public class Ex15_Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isChange=false;
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    isChange = true;
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!isChange){
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
