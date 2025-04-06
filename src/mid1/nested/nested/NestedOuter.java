package mid1.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue =2;
    static  class Nested{
        private int nestedInstanceValue =1;

        public void print() {
            // 자신의 맴버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 변수에 접근, 에러
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 맴버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
