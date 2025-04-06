package mid1.nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("AnonymousMain.hello");
            }
        };
        hello.hello();
        Hello hello2 = () -> System.out.println("AnonymousMain.hello");
        hello2.hello();
    }
}
