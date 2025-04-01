package codingtest;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ex22_Radix {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        radixSort(arr, 5);
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void radixSort(int[] arr, int max_size) {
        int[] output = new int[arr.length];
        int divisor=1;
        int count=0;
        while (count != max_size) {
            int[] bucket = new int[10];
            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i]/divisor)%10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = 0; i < arr.length; i++) {
                output[bucket[arr[i] / divisor % 10] - 1] = arr[i];
                bucket[arr[i] / divisor % 10]--;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }
            divisor*=10;
            count++;
        }
    }
}
