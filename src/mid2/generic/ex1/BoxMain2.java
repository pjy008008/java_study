package mid2.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer =(Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 타입 전달 문제가 있음
        integerBox.set("문자 100");
        Integer result = (Integer) integerBox.get(); // String->Integer Casting Error
        System.out.println("result = " + result);
    }
}
