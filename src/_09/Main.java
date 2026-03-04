package _09;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 2, 28);
        LocalDate endDate = LocalDate.of(2026, 7, 2);

        long timeFromStart = ChronoUnit.DAYS.between(startDate, today);
        long timeToEnd = ChronoUnit.DAYS.between(today, endDate);

        System.out.println(timeFromStart);
        System.out.println(timeToEnd);
    }
}
