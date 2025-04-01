package codingtest;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Ex13_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int lastNum=1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }
        while(queue.size()!=1){
            queue.poll();
            lastNum=queue.poll();
            queue.add(lastNum);
        }
        System.out.println(lastNum);
    }
}
