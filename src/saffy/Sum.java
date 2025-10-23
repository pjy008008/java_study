package saffy;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int testCase = sc.nextInt();
            int[][] arr = new int[100][100];
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int leftMax =0;
            int rightMax = 0;
            int prevRowMax = 0;
            int prevColMax = 0;
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    rowMax += arr[j][k];
                    colMax += arr[k][j];
                    //leftCross
                    if (j == k) {
                        leftMax += arr[j][k];
                    }
                    //rightCross
                    if ((j + k) == 99) {
                        rightMax += arr[j][k];
                    }
                }
                if (rowMax > prevRowMax) {
                    prevRowMax = rowMax;
                }
                if (colMax > prevColMax) {
                    prevColMax = colMax;
                }
                rowMax = 0;
                colMax = 0;
            }
            int matrixMax = Math.max(prevRowMax, prevColMax);
            int crossMax = Math.max(leftMax, rightMax);
            int max = Math.max(matrixMax, crossMax);
            System.out.println("#" + testCase + " " + max);
        }
    }
}
