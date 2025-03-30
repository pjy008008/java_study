package mid1.lang.object;

public class Child extends Parent{
    //extends를 했기 때문에 Object를 상속받지 않음
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
