package ssafy;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력 및 행렬 초기화
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 각 회전된 행렬 생성
        int[][] rot90 = rotate90(matrix, N);
        int[][] rot180 = rotate180(matrix, N);
        int[][] rot270 = rotate270(matrix, N);

        // 출력 형식 맞추기 (행 단위로 90도, 180도, 270도 순서대로 출력)
        for (int i = 0; i < N; i++) {
            // 90도 행렬의 i번째 행 출력
            for (int j = 0; j < N; j++) System.out.print(rot90[i][j]);
            System.out.print(" ");

            // 180도 행렬의 i번째 행 출력
            for (int j = 0; j < N; j++) System.out.print(rot180[i][j]);
            System.out.print(" ");

            // 270도 행렬의 i번째 행 출력
            for (int j = 0; j < N; j++) System.out.print(rot270[i][j]);

            System.out.println(); // 줄바꿈
        }

        sc.close();
    }

    // 90도 회전 로직
    public static int[][] rotate90(int[][] arr, int N) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = arr[N - 1 - j][i];
            }
        }
        return res;
    }

    // 180도 회전 로직
    public static int[][] rotate180(int[][] arr, int N) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = arr[N - 1 - i][N - 1 - j];
            }
        }
        return res;
    }

    // 270도 회전 로직
    public static int[][] rotate270(int[][] arr, int N) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = arr[j][N - 1 - i];
            }
        }
        return res;
    }
}