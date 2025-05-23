package mid1.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("11"); //문자열, 래퍼 객체 변환
        int i3 = Integer.parseInt("10"); //문자열 전용, 기본형으로 변환

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
