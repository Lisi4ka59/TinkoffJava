import edu.hw5.Task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeDurationCalculatorTest {

    @Test
    public void testDurationCalculation() {
        String input1 = "2022-03-12, 20:20 - 2022-03-12, 23:50";
        String input2 = "2022-04-01, 21:30 - 2022-04-02, 01:20";

        assertEquals("3ч 30м", Task1.TimeDurationCalculator.duration(input1));
        assertEquals("3ч 50м", Task1.TimeDurationCalculator.duration(input2));
    }

    @Test
    public void testDurationWithMidnightCrossing() {
        String input = "2022-03-12, 23:00 - 2022-03-13, 01:00";

        assertEquals("2ч 0м", Task1.TimeDurationCalculator.duration(input));
    }

    @Test
    public void testDurationWithSameStartTimeAndEndTime() {
        String input = "2022-03-12, 12:00 - 2022-03-12, 12:00";

        assertEquals("0ч 0м", Task1.TimeDurationCalculator.duration(input));
    }
}
