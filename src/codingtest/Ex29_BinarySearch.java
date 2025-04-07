package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex29_BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boolean find=false;
            int high = arr.length-1;
            int low =0;
            int x = Integer.parseInt(st.nextToken());
            while (low<=high) {
                int medium= (high+low)>>>1;
                if(x>arr[medium]){
                    low=medium+1;
                }else if(x<arr[medium]){
                    high=medium-1;
                }else{
                    System.out.println(1);
                    find=true;
                    break;
                }
            }
            if (!find) {
                System.out.println(0);
            }
        }
    }
}
