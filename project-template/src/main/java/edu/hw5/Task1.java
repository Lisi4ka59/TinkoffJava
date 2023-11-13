package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task1 {
    public static class TimeDurationCalculator {
        public static String duration(String inputs) {

            Duration totalDuration = Duration.ZERO;

                String[] parts = inputs.split(" - ");
            String parsedStartTime = (parts[0].replace(", ", "T") + ":00");
            String parsedEndTime = (parts[1].replace(", ", "T") + ":00");
                LocalDateTime startTime = LocalDateTime.parse(parsedStartTime);
                LocalDateTime endTime = LocalDateTime.parse(parsedEndTime);

                if (endTime.isBefore(startTime)) {
                    return "Некорректные входные данные!";

                }
                totalDuration = totalDuration.plus(Duration.between(startTime, endTime));
            long hours = totalDuration.toHours();


            long minutes = totalDuration.minusHours(hours).toMinutes();

            return hours + "ч " + minutes + "м";
        }
    }
}
