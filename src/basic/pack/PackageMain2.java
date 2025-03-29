package basic.pack; //첫줄엔 package, 다음줄부터 import 가능

import basic.pack.a.User;
import basic.pack.a.User2;

//import basic.pack.a.*; //모든 class import

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //다른 위치에 있을경우 src부터 경로 표시
        User2 user2 = new User2();
    }
}
