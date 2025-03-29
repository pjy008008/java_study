package basic.pack;

import basic.pack.a.User;


public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        basic.pack.b.User user2 = new basic.pack.b.User(); //같은 이름의 class호출했으면 하나는 무조건 명시적으로 적어야함
        // 자주 사용하지 않는 class를 명시적으로 적음
    }
}
