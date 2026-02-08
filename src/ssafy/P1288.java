package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int visited = 0;
            int weight = 1;
            int n = Integer.parseInt(br.readLine());
            while (true) {
                String strN = String.valueOf(n * weight);
                for (int j = 0; j < strN.length(); j++) {
                    int x = strN.charAt(j) - '0';
                    visited = visited | (1 << x);
                }
                if (check(visited)) {
                    break;
                }
                weight++;
            }
            sb.append("#").append(i).append(" ").append(n * weight).append("\n");
        }
        System.out.println(sb);
    }

    private static boolean check(int visited) {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = x | (1 << i);
        }
        return (visited & x) == x;
    }
}
