package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P1229 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			int n = Integer.parseInt(br.readLine());
			List<String> list = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				list.add(st.nextToken());
			}
			int cn = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "ID");
			for (int j = 0; j < cn; j++) {
				String commandLine = st.nextToken();
				String[] commandBlock = commandLine.trim().split(" ");
				int idx = Integer.parseInt(commandBlock[0]);
				int amount = Integer.parseInt(commandBlock[1]);
				if (commandBlock.length == 2) {
					for (int k = 0; k < amount; k++) {
						list.remove(idx);
					}
				} else {
					for (int k = 0; k < amount; k++) {
						list.add(idx++, commandBlock[k + 2]);
					}
				}

			}
			sb.append("#").append(i).append(" ");
			for (int j = 0; j < 10; j++) {
				sb.append(list.get(j)).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
