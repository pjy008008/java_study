package basic.poly.ex;

public class SmsSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println("SMS를 발송합니다: "+str);
    }
}
