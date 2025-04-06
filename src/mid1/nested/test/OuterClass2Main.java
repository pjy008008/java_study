package mid1.nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 class2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = class2.new InnerClass();
        innerClass.hello();
    }
}
