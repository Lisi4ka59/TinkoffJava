package edu.hw5;

import java.time.Duration;
import java.time.LocalTime;

public class Task1 {
    public static class TimeDurationCalculator {
        public static String duration(String inputs) {

            Duration totalDuration = Duration.ZERO;

                String[] parts = inputs.split(" - ");
                LocalTime startTime = LocalTime.parse(parts[0].split(", ")[1]);
                LocalTime endTime = LocalTime.parse(parts[1].split(", ")[1]);
                if (endTime.isBefore(startTime)) {
                    endTime = endTime.plusHours(24);

                }
                totalDuration = totalDuration.plus(Duration.between(startTime, endTime));
            long hours = totalDuration.toHours();


            long minutes = totalDuration.minusHours(hours).toMinutes();

            return hours + "ч " + minutes + "м";
        }
    }
}
