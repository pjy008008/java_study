package basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // compile error
//        instanceMethod(); // compile error
        staticValue++; // access static value
        staticMethod(); //call static method
    }
    public void instanceCall(){
        instanceValue++; // access instance value
        instanceMethod(); // call instance method
        staticValue++; // access static value
        staticMethod(); //call static method
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
