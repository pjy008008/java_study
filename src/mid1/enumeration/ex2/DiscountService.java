package mid1.enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int disccountPercent = 0;
        if(classGrade==ClassGrade.BASIC){
            disccountPercent=10;
        } else if (classGrade == ClassGrade.GOLD) {
            disccountPercent=20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            disccountPercent=30;
        } else{
            System.out.println("할인 X");
        }

        return price*disccountPercent/100;
    }
}
