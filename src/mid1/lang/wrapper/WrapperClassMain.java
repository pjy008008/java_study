package mid1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정, valueOf사용
        Integer integerObj = Integer.valueOf(10); //-128~127 같이 자주 사용하는 숫자 재사용
        Long longObj = Long.valueOf(1000);
        Double doubleObj = Double.valueOf(1.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int value = integerObj.intValue();
        System.out.println("value = " + value);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
