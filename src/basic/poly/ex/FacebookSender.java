package basic.poly.ex;

public class FacebookSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println("페이스북에 발송합니다: "+str);
    }
}
