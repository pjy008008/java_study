package basic.extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10,20); //기본생성자가 없음으로 생략 불가능
        System.out.println("ClassC 생성자");
    }
}
