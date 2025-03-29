package basic.poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결재수단을 입력하세요: ");
            String payOption = scanner.nextLine();
            if (payOption.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("비용을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption,amount);
        }
    }
}