package codingtest;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=1;
        int count=1;
        int startIndex = 0,endIndex =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }
        while (true) {
            if(arr[startIndex]==n) {
                break;
            }
            if(sum==n){
                count++;
                if(endIndex == arr.length-1){
                    break;
                }
                sum+=arr[++endIndex];
            } else if(sum<n){
                if(endIndex == arr.length-1){
                    break;
                }
                sum+=arr[++endIndex];
            }else if(sum>n){
                sum-=arr[startIndex++];
            }

        }
        System.out.println(count);
    }
}
