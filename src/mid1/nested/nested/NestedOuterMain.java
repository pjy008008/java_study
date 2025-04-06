package mid1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        //이 객체는 Nested와 아무런 관계가 없음, 중첩만 됭있는 관계
//        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        //안쪽의 클래스는 &로 구분함
        System.out.println("nestedClass = "+nested.getClass());
    }
}
