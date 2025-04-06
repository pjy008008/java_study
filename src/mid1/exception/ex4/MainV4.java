package mid1.exception.ex4;

import mid1.exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

//        NetworkServiceV4 networkServiceV4 = new NetworkServiceV4();
        NetworkServiceV5 networkServiceV5 = new NetworkServiceV5();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkServiceV5.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        //공통 예외 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다");
        System.out.println("==개발자용 디버그 메시지==");
        e.printStackTrace(System.out);
        //밑의 코드 사용 시 빨간색으로 출력, printStackTrace의 기본 출력은 System.err이다.
//        e.printStackTrace(System.err);

        //필요하면 예외별로 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송] 전송 데이터: "+sendEx.getSendData());
        }
    }
}
