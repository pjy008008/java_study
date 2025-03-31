package mid1.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] strings = fruits.split(",");
        for (String s : strings) {
            System.out.println(s);
        }
        String joinedStr = String.join("->", strings[0], strings[1], strings[2]);
        System.out.println("joinedStr = " + joinedStr);
    }
}
