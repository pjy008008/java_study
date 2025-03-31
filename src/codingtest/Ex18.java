package codingtest;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sumArr = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int insertP = i;
            int insertV = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]<arr[i]){
                    insertP=j+1;
                    break;
                }
                if(j==0){
                    insertP=0;
                }
            }
            for (int j = i; j > insertP; j--) {
                arr[j]=arr[j-1];
            }
            arr[insertP]=insertV;
        }
        sumArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sumArr[i] = sumArr[i-1]+arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum += sumArr[i];
        }
        System.out.println(sum);
    }
}
