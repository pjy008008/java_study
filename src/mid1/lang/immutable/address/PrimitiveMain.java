package mid1.lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        //기본형은 같은 값 공유 불가
        int a=10;
        int b=a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("20->b");
        b=20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
