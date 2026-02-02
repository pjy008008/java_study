package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[][] map = new int[n][n];
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					map[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < n - m + 1; j++) {
				for (int k = 0; k < n - m + 1; k++) {
					int sum = getSum(map, j, k, m);
					if (sum > max) {
						max = sum;
					}
				}
			}
			sb.append("#").append(i).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
	}

	private static int getSum(int map[][], int x, int y, int m) {
		int sum = 0;
		for (int i = x; i < x + m; i++) {
			for (int j = y; j < y + m; j++) {
				sum += map[i][j];
			}
		}
		return sum;
	}
}
