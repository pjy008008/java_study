package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P5215 {
    private static int n;
    private static int l;
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            List<Ingredient> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                list.add(new Ingredient(s, k));
            }
            getMax(0, 0, 0, list);
            sb.append("#").append(i).append(" ").append(max).append("\n");
            max = 0;
        }
        System.out.println(sb);
    }

    private static void getMax(int idx, int sum, int score, List<Ingredient> list) {
        if (sum > l) {
            return;
        }
        if (idx == n) {
            max = Math.max(max, score);
            return;
        }
        getMax(idx + 1, sum + list.get(idx).kcal, score + list.get(idx).score, list);
        getMax(idx + 1, sum, score, list);
    }

    static class Ingredient {
        int score;
        int kcal;

        Ingredient(int score, int kcal) {
            this.score = score;
            this.kcal = kcal;
        }
    }
}
