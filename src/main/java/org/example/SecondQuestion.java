package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class SecondQuestion {
    public static void main(String[] args) {
        LocalDate from = LocalDate.of(2019, 3, 1);
        LocalDate to = LocalDate.of(2024, 9, 30);
        long days = ChronoUnit.DAYS.between(from, to);
        int weeks = (int) (days / 7);
        int totalHours = weeks * 6 + weeks * 9;
        System.out.println("He has totally worked: " + totalHours  + "  hours ");
    }
}
