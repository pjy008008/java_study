package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int check = 0;
            for (int j = 0; j < n; j++) {
                check = check | 1 << j;
            }
            sb.append("#").append(i).append(" ");
            if ((check & m) == check) {
                sb.append("ON\n");
            }else{
                sb.append("OFF\n");
            }
        }
        System.out.println(sb);
    }
}
