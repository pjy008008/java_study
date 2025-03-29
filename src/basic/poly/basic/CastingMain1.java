package basic.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모가 자식 참조
        Parent poly = new Child();
        //poly.childMethod() 기능호출 불가

        //DownCasting
        Child child = (Child) poly;
        child.childMethod();
    }
}
