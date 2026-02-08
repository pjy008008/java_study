package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P1230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            List<String> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                list.add(st.nextToken());
            }
            br.readLine();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (token.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    List<String> temp = new LinkedList<>();
                    for (int k = 0; k < y; k++) {
                        temp.add(st.nextToken());
                    }
                    list.addAll(x, temp);
                }
                if (token.equals("D")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for (int k = 0; k < y; k++) {
                        list.remove(x);
                    }
                }
                if (token.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());
                    for (int k = 0; k < y; k++) {
                        list.add(st.nextToken());
                    }
                }
            }
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < 10; j++) {
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
