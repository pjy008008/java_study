package basic.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";

        //static method를 사용하면 instance생성 없이도 사용가능
        String deco = DecoUtil2.deco(s);

        System.out.println("before: "+s);
        System.out.println("before: "+deco);
    }
}
