package mid1.enumeration.ex3;

import static mid1.enumeration.ex3.Grade.*;

public class DisccountService {
    public int discount(Grade grade, int price) {
        int disccountPercent = 0;
        if(grade== BASIC){
            disccountPercent=10;
        } else if (grade==GOLD) {
            disccountPercent=20;
        } else if (grade==DIAMOND) {
            disccountPercent=30;
        } else{
            System.out.println("할인 X");
        }

        return price*disccountPercent/100;
    }
}
