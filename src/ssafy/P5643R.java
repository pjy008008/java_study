package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5643R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            boolean[][] connection = new boolean[n][n];
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                connection[a - 1][b - 1] = true;
            }
            connection = floyd(connection, n);
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < n; k++) {
                    if (j == k) continue;
                    if (!(connection[j][k] || connection[k][j])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) cnt++;
            }
            sb.append("#").append(i).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    private static boolean[][] floyd(boolean[][] connection, int n) {
        for (int m = 0; m < n; m++) {
            for (int s = 0; s < n; s++) {
                for (int e = 0; e < n; e++) {
                    if (connection[s][m] && connection[m][e]) {
                        connection[s][e] = true;
                    }
                }
            }
        }
        return connection;
    }
}
