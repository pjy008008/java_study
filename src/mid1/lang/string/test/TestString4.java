package mid1.lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,5);
        String extName = str.substring(6);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
