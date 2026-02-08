package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P5122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            List<Integer> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                int idx = Integer.parseInt(st.nextToken());
                if (cmd.equals("I")) {
                    int data = Integer.parseInt(st.nextToken());
                    list.add(idx, data);
                    n++;
                }
                if (cmd.equals("D")) {
                    list.remove(idx);
                    n--;
                }
                if (cmd.equals("C")) {
                    int data = Integer.parseInt(st.nextToken());
                    list.remove(idx);
                    list.add(idx, data);
                }
            }
            sb.append("#").append(i).append(" ");
            if (l < n) {
                sb.append(list.get(l)).append("\n");
            }else{
                sb.append("-1\n");
            }
        }
        System.out.println(sb);
    }
}
