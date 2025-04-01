package mid1.enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price =10000;
        DiscountService discountService = new DiscountService();
        //착각해서 새로 객체를 생성할 수 있는 문제가 있다.
        /*ClassGrade classGrade = new ClassGrade();
        disccountService.discount(classGrade, price);
        System.out.println("classGrade = " + classGrade);*/
    }
}
