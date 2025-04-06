package mid1.exception.ex4;


public class NetworkServiceV5 {
    public static void sendMessage(String data) {
        String address = "https:/example.com";

        //에러 발생 코드


        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
