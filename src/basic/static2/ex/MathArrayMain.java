package basic.static2.ex;

import static basic.static2.ex.MathArrayUtils.*;
public class MathArrayMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum="+sum(values));
        System.out.println("average="+average(values));
        System.out.println("sum="+min(values));
        System.out.println("sum="+max(values));
    }
}
