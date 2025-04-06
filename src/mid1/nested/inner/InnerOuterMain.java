package mid1.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        //인스턴스를 알아야 함, outer에 참조한다
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = "+inner.getClass());
    }
}
