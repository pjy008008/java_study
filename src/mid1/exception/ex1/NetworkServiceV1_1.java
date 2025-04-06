package mid1.exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        //에러 발생 코드
        client.initError(data);
        
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
