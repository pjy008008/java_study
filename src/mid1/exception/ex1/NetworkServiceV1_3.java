package mid1.exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        //에러 발생 코드
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: "+connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
