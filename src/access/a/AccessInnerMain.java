package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //어디서든 접근 가능
        data.publicField=1;
        data.publicMethod();

        //같은 패키지이므로 접근 가능
        data.defaultField=2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField=3;
        //data.privateMethod();

        data.innerAccess();
    }
}
