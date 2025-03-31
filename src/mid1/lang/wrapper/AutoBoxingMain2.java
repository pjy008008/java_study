package mid1.lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        int value =7;
        Integer boxedValue = value; //Auto-Boxing

        int unboxedValue = boxedValue; //Auto-Unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
