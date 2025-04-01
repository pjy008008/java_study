package codingtest;

import java.io.*;

public class Ex20_Merge {
    public static int[] arr;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        tmp = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort( 1, n);
        for (int i = 1; i < n+1; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int s, int e) {
        if (e - s < 1) {
            return;
        }
        int m = s + (e - s) / 2;
        mergeSort(s, m);
        mergeSort(m + 1, e);
        for (int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }
        int k=s;
        int index1=s;
        int index2=m+1;
        while (index1 <= m && index2 <= e) {
            if (tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                k++;
                index2++;
            }
            else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2<=e){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
