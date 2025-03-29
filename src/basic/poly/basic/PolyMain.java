package basic.poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child => Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent->Child");
        Parent poly = new Child(); //부모가 자식을 담을 수 있음, 다형적 참조
        poly.parentMethod();

//        Child child1 = new Parent(); // 자식은 부모를 담을 수 없음

        //자식의 기능 호출 불가능
//        poly.childMethod();
    }
}
