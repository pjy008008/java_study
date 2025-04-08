import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int p = 0; p < t; p++) {
            String functions = sc.nextLine();
            String[] function = functions.split("");
            int n = sc.nextInt();
            sc.nextLine();
            String arr = sc.nextLine();
            arr = arr.replaceAll("\\[|\\]", "");
            if (arr.equals("")) {
                System.out.println("error");
                continue;
            }
            String[] parts = arr.split(",");
            Deque<Integer> deque = new LinkedList<>();
            boolean isReversed =false;
            for (String part : parts) {
                deque.add(Integer.valueOf(part));
            }
            if(deque.size()< function.length){
                System.out.println("error");
                continue;
            }
            for (int i = 0; i < function.length; i++) {
                if (function[i].equals("R")) {
                    isReversed = !isReversed;
                }
                if (function[i].equals("D")) {
                    if(isReversed){
                        deque.pollLast();
                    }else{
                        deque.pollFirst();
                    }
                }
            }
            int[] array = new int[deque.size()];
            for (int i = 0; i < deque.size(); i++) {
                array[i] = deque.pollFirst();
            }
            System.out.println(Arrays.toString(array));
        }
    }
}