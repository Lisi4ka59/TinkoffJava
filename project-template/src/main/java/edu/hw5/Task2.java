package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static class FridayThirteenths {
        public static List<LocalDate> findFridayThirteenths(int year) {
            List<LocalDate> fridayThirteenths = new ArrayList<>();
            LocalDate date = LocalDate.of(year, 1, 13);
            while (date.getYear() == year) {
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    fridayThirteenths.add(date);
                }
                date = date.plusMonths(1);
            }
            return fridayThirteenths;
        }

        public static LocalDate findNextFridayThirteenth(LocalDate date) {
            if (date.getDayOfMonth() < 13) {
                return date.withDayOfMonth(13).with(DayOfWeek.FRIDAY);
            } else {
                return date.plusYears(1).withMonth(1).withDayOfMonth(13).with(DayOfWeek.FRIDAY);
            }
        }
    }
}
