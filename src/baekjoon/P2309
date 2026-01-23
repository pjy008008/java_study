package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j) {
					continue;
				}
				int sum = 0;
				for (int k = 0; k < 9; k++) {
					if (k == i || k == j) {
						continue;
					} else {
						sum += arr[k];
					}
				}
				if (sum == 100) {
					List<Integer> list = new ArrayList<>();
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
						} else {
							list.add(arr[k]);
						}
					}
					Collections.sort(list);
					for(Integer x: list) {
						System.out.println(x);
					}
					System.exit(0);
				}
			}
		}
	}
}
