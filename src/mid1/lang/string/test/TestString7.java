package mid1.lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "     Hello Java   ";
        String changed = original.strip();
        System.out.println(changed);
    }
}
