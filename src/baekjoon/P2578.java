package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2578 {
	static int[][] map = new int[5][5];
	static boolean[][] isVisit = new boolean[5][5];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int count=0;
		for(int i=0;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				int x = Integer.parseInt(st.nextToken());
				visit(x);
				count++;
				if(getBingo()>2) {
					System.out.println(count);
					System.exit(0);
				}
			}
		}
	}

	private static void visit(int x) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (map[i][j] == x) {
					isVisit[i][j] = true;
				}
			}
		}
	}

	private static int getBingo() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int xSum = 0;
			int ySum = 0;
			for (int j = 0; j < 5; j++) {
				if(isVisit[i][j]) {
					xSum++;
				}
				if(isVisit[j][i]) {
					ySum++;
				}
			}
			if(xSum==5) {
				sum++;
			}
			if(ySum==5) {
				sum++;
			}
		}
		int lCross=0;
		int rCross=0;
		for(int i=0;i<5;i++) {
			if(isVisit[i][i]) {
				lCross++;
			}
			if(isVisit[i][4-i]) {
				rCross++;
			}
		}
		if(lCross==5) {
			sum++;
		}
		if(rCross==5) {
			sum++;
		}
		return sum;
	}
}
