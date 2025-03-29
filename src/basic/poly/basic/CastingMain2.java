package basic.poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모가 자식 참조
        Parent poly = new Child();
        //poly.childMethod() 기능호출 불가

        //일시적 DownCasting - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child)poly).childMethod();
    }
}
