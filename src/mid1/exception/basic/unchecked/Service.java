package mid1.exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외를 잡지 않아도 상위로 throws한다.
    public void callThrow() {
        client.call();
    }
}
