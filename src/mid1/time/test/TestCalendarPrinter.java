package mid1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek week = date.getDayOfWeek();
        int lastDay = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println("lastDay = " + lastDay);
        System.out.println(" SU  MO  TU  We  Th  Fr  Sa");
        int firstDay;
        if(week.equals(DayOfWeek.SUNDAY)){
            firstDay=0;
        }else if (week.equals(DayOfWeek.MONDAY)) {
            firstDay=1;
        } else if (week.equals(DayOfWeek.TUESDAY)) {
            firstDay=2;
        } else if (week.equals(DayOfWeek.WEDNESDAY)) {
            firstDay=3;
        }else if (week.equals(DayOfWeek.THURSDAY)) {
            firstDay=4;
        }else if (week.equals(DayOfWeek.FRIDAY)) {
            firstDay=5;
        }else {
            firstDay=6;
        }
        int day=1;
        for (int i=1; i < lastDay+firstDay; i++) {
            if (i < firstDay) {
                System.out.print("    ");
            }else{
                System.out.printf("%3d ",day);
                if (i % 7 == 0) {
                    System.out.println();
                }
                day++;
            }
        }
    }
}
