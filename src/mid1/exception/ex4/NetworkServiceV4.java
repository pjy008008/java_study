package mid1.exception.ex4;


public class NetworkServiceV4 {
    public static void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        //에러 발생 코드
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
