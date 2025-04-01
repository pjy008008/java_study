package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex19_Quick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(a, 0, n - 1,k-1);
        System.out.println(a[k - 1]);
    }
    public static void quickSort(int[] a, int s, int e,int k) {
        if (s < e) {
            int pivot = partition(a,s,e);
            if(pivot==k){
                return;
            }
            quickSort(a, s, pivot - 1,k);
            quickSort(a, pivot + 1, e,k);
        }
    }
    private static int partition(int[] a, int s, int e) {
        int pivot = a[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, e);
        return i + 1;
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }
}
