package mid1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        //참조형이면 원래 더하기 연산이 불가능(참조값을 더하기 때문)하지만 문자열은 예외로 처리됨
        String result2 = a+b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
