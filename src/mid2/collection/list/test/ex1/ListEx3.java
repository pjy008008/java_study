package mid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료0)");
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            list.add(x);
        }
        System.out.println("출력");
        int sum=0;
        for (Integer integer : list) {
            sum += integer;
        }
        double average = (double) sum / list.size();
        System.out.println("입력된 정수의 합계: "+sum);
        System.out.println("입력된 정수의 평균: "+average);
    }
}
