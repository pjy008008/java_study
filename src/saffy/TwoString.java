package saffy;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int max=0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arrN = new int[n];
            int[] arrM = new int[m];
            for (int j = 0; j < n; j++) {
                arrN[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                arrM[j] = sc.nextInt();
            }
            if (m > n) {
                for (int j = 0; j < n; j++) {
                    max += arrN[j] * arrM[j];
                }
                int left = m - n;
                int temp=0;
                for (int j = 1; j <= left; j++) {
                    for (int k = 0; k < n; k++) {
                        temp+=arrN[k] * arrM[k+j];
                    }
                    if (temp > max) {
                        max=temp;
                    }
                    temp=0;
                }
            } else if (n > m) {
                for (int j = 0; j < m; j++) {
                    max += arrN[j] * arrM[j];
                }
                int left = n - m;
                int temp=0;
                for (int j = 1; j <= left; j++) {
                    for (int k = 0; k < m; k++) {
                        temp+=arrN[k+j] * arrM[k];
                    }
                    if (temp > max) {
                        max=temp;
                    }
                    temp=0;
                }
            }else{
                for (int j = 0; j < m; j++) {
                    max = arrN[j] * arrM[j];
                }
            }
            System.out.println("#"+(i+1)+" "+max);
        }
    }
}
