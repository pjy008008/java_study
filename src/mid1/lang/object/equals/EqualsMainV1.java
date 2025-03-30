package mid1.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-001");
        UserV1 user2 = new UserV1("id-001");

        System.out.println("identity = " + (user1 == user2));
        //기본이면 equals는 ==을 제공, Overriding해서 바꿔야 함
        //동등성이라는 개념은 객체마다 다르기 때문, 어떤 한 객체는 ID를 기반으로 동등성을 구분할 수 있음
        System.out.println("equality = "+(user1.equals(user2)));
    }
}
