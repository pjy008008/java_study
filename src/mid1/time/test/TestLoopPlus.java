package mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate newDate = date.plusWeeks(2 * i);
            System.out.println("날짜 " + (i+1) + ": " + newDate);
        }
    }
}
