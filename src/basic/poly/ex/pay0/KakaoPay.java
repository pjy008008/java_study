package basic.poly.ex.pay0;

public class KakaoPay implements Paytype{
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount+"원 결재를 시도합니다.");
        return true;
    }
}
