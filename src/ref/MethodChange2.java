package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value=10;
        System.out.println("메서드 호출 전: a = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 전: a = " + dataA.value);

        String str = "hello";
        System.out.println(str);
        changeReference(str);
        System.out.println(str);
    }
    public static void changeReference(Data dataX){
        dataX.value=20;
    }
    public static void changeReference(String str){
        str = "hello world";
    }
}
