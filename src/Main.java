import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int sum = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        System.out.println(sum);
        String str = a+b;
        sum = Integer.parseInt(str) - Integer.parseInt(c);
        System.out.println(sum);
    }
}