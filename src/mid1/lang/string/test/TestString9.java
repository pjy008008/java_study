package mid1.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
//        int index = email.indexOf("@");
//        String id = email.substring(0, index);
//        String domain = email.substring(index + 1);
//        System.out.println("id = " + id);
//        System.out.println("domain = " + domain);
        String[] strings = email.split("@");
        System.out.println("ID: " + strings[0]);
        System.out.println("Domain: " + strings[1]);
    }
}
