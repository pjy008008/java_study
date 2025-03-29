package basic.poly.ex.pay0;

public class PayStore {
    public static Paytype findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("newpay")) {
            return new NewPay();
        }else{
            return new DefaultPay();
        }
    }
}
