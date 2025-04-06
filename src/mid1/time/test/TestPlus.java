package mid1.time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        localDateTime = localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("localDateTime = " + localDateTime);
    }
}
