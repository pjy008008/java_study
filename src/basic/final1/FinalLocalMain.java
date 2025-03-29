package basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 변수
        final int data1;
        data1=10;
//      data=20; 컴파일 오류

        final int data2=10;
//        data2=20;
    }
    static void method(final int prameter){
//        prameter=20; compile error
    }
}
