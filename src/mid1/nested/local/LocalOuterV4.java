package mid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(final int parameter) {
        //Effectively final, 인스턴스가 참조한 지역변수 값은 절대 변하면 안된다(규칙)
        final int localVar =1; //지역변수, stack 프레임 종료 시 제거
        class LocalPrinter implements Printer{
            int value = 0;
            @Override
            public void print() {

                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 오래 살아남음
                System.out.println("localVar = " + localVar);
                System.out.println("parameter = " + parameter);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        //만약 localVar의 값을 변경한다면?
//        localVar=10; compile error
//        parameter=20; compile error

//        localPrinter.print(); 여기서 실행하지 않고 Printer인스턴스만 반환
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행, process()의 스택 프레임이 사라진 이후에 실행.
        printer.print();

        //추가
        System.out.println("Field check");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
