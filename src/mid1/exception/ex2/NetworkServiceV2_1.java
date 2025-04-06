package mid1.exception.ex2;

public class NetworkServiceV2_1 {
    public static void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "https:/example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        //에러 발생 코드
        client.initError(data);
        
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
