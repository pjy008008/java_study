package basic.poly.ex;

public class EmailSender implements Sender{
    @Override
    public void send(String str) {
        System.out.println("메일을 발송합니다: "+str);
    }
}
