package mid1.exception.ex3;


import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {

//        NetworkServiceV3_1 networkServiceV3_1 = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkServiceV3_2 = new NetworkServiceV3_2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            NetworkServiceV3_2.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
