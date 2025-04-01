package mid1.enumeration.ref3;

public class DiscountService {
    //없어도 된다!
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
