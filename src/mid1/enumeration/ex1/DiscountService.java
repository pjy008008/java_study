package mid1.enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price) {
        int disccountPercent = 0;
        if (grade.equals(StringGrade.BASIC)) {
            disccountPercent=10;
        } else if (grade.equals(StringGrade.GOLD)) {
            disccountPercent=20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            disccountPercent=30;
        }else{
            System.out.println(grade +": 할인X");
        }
        return price*disccountPercent/100;
    }
}
