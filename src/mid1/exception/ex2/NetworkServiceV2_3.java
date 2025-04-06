package mid1.exception.ex2;

public class NetworkServiceV2_3 {
    public static void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        //에러 발생 코드
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
    }
}
