package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			for (int j = n - 1; j >= (i - x); j--) {
				if((j-1)<0) {
					break;
				}
				arr[j] = arr[j - 1];
			}
			arr[i - x] = i + 1;
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}
}
