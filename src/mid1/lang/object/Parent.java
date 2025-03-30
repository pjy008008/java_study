package mid1.lang.object;

public class Parent {
    //부모가 없으면 묵시적으로 Object class 상속
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
