package basic.access.b;

import basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //어디서든 접근 가능
        data.publicField=1;
        data.publicMethod();

        //다른 패키지이므로 default 호출 불가
        //data.defaultField=2;
        //data.defaultMethod();

        //private 호출 불가
        //data.privateField=3;
        //data.privateMethod();

        data.innerAccess();
    }
}
