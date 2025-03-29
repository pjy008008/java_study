package basic.poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("Value = "+child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent->Parent");
        System.out.println("Value ="+parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent->Child");
        System.out.println("Value = " + poly.value); //변수는 오버라이딩 안됨
        poly.method(); //메서드는 오버라이딩
        //오버라이딩 된 메서드는 항상 우선권을 가짐, 더 하위일수록 우선권이 높음
    }
}
