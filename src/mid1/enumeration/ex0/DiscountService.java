package mid1.enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int disccountPercent = 0;
        if (grade.equals("BASIC")) {
            disccountPercent=10;
        } else if (grade.equals("GOLD")) {
            disccountPercent=20;
        } else if (grade.equals("DIAMOND")) {
            disccountPercent=30;
        }else{
            System.out.println(grade +": 할인X");
        }
        return price*disccountPercent/100;
    }
}
