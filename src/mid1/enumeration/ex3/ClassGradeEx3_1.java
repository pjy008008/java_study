package mid1.enumeration.ex3;

import static mid1.enumeration.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DisccountService disccountService = new DisccountService();
        int basic = disccountService.discount(BASIC, price);
        int gold = disccountService.discount(GOLD, price);
        int diamond = disccountService.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
