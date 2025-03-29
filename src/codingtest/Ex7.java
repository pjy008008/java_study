package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int startIndex=0,endIndex=n-1;
        int count=0;
        int sum;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        while (startIndex<endIndex) {
            sum=array[startIndex]+array[endIndex];
            if(m==sum) {
                count++;
                startIndex++;
                endIndex--;
            }else if(sum>m){
                endIndex--;
            } else if (sum < m) {
                startIndex++;
            }
        }
        System.out.println(count);
    }
}
