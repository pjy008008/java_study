package basic.poly.ex.pay0;

import static basic.poly.ex.pay0.PayStore.findPay;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결재를 시작합니다: option = "+option+", amount = "+amount);

        Paytype paytype = findPay(option);
        boolean result = paytype.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
