package basic.poly.ex.pay0;

public class DefaultPay implements Paytype{

    @Override
    public boolean pay(int amount) {
        System.out.println("결재 수단이 없습니다.");
        return false;
    }
}
