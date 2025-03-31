package mid1.lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int totalLength=0;
        for (String s : arr) {
            System.out.println(s+":"+s.length());
            totalLength += s.length();
        }
        System.out.println("totalLength = " + totalLength);
    }
}
