package mid1.nested.annonymous;

import mid1.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar =1;

        //new Printer의 Printer는 구현할 부모타입이다.
        //Printer인터페이스를 구현(상속)하면서 생성하는 것이다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {

                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("parameter = " + parameter);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class="+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
