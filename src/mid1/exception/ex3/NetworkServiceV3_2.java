package mid1.exception.ex3;


import mid1.exception.ex3.exception.ConnectExceptionV3;
import mid1.exception.ex3.exception.NetworkClientExceptionV3;
import mid1.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public static void sendMessage(String data) {
        String address = "https:/example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        //에러 발생 코드
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: "+e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
