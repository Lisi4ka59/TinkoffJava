package edu.hw5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Task3 {
    public static class DateParser {
        public static Optional<LocalDate> parseDate(String string) {
            if (string.matches("\\d{4}-\\d{2}-\\d{2}")) {
                return Optional.of(LocalDate.parse(string, DateTimeFormatter.ISO_LOCAL_DATE));
            } else if (string.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
                return Optional.of(LocalDate.parse(string, DateTimeFormatter.ofPattern("M/d/yyyy")));
            } else if (string.matches("\\d{1,2}/\\d{1,2}/\\d{2}")) {
                return Optional.of(LocalDate.parse(string, DateTimeFormatter.ofPattern("M/d/yy")));
            } else if (string.equalsIgnoreCase("tomorrow")) {
                return Optional.of(LocalDate.now().plusDays(1));
            } else if (string.equalsIgnoreCase("today")) {
                return Optional.of(LocalDate.now());
            } else if (string.equalsIgnoreCase("yesterday")) {
                return Optional.of(LocalDate.now().minusDays(1));
            } else {
                String[] parts = string.split(" ");
                if (parts.length == 2) {
                    try {
                        int amount = Integer.parseInt(parts[0]);
                        String unit = parts[1].toLowerCase();
                        if (unit.equals("day") || unit.equals("days")) {
                            return Optional.of(LocalDate.now().minusDays(amount));
                        }
                    } catch (NumberFormatException e) {
                        // Ignore and continue to the next format check
                    }
                }
            }
            return Optional.empty();
        }
    }
}
