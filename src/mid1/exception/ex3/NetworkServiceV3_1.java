package mid1.exception.ex3;


import mid1.exception.ex3.exception.ConnectExceptionV3;
import mid1.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public static void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        //에러 발생 코드
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (SendExceptionV3 e) {
            System.out.println("[연결 오류] 전송 데이터: "+e.getSendData()+", 메세지: "+e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메세지: "+e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
