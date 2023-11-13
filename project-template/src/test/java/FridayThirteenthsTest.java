import edu.hw5.Task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

public class FridayThirteenthsTest {

    @Test
    public void testFindFridayThirteenths() {
        List<LocalDate> fridayThirteenths1925 = Task2.FridayThirteenths.findFridayThirteenths(1925);
        List<LocalDate> fridayThirteenths2024 = Task2.FridayThirteenths.findFridayThirteenths(2024);

        assertEquals(3, fridayThirteenths1925.size());
        assertEquals(LocalDate.of(1925, 2, 13), fridayThirteenths1925.get(0));
        assertEquals(LocalDate.of(1925, 3, 13), fridayThirteenths1925.get(1));
        assertEquals(LocalDate.of(1925, 11, 13), fridayThirteenths1925.get(2));

        assertEquals(2, fridayThirteenths2024.size());
        assertEquals(LocalDate.of(2024, 9, 13), fridayThirteenths2024.get(0));
        assertEquals(LocalDate.of(2024, 12, 13), fridayThirteenths2024.get(1));
    }

    @Test
    public void testFindNextFridayThirteenth() {
        LocalDate nextFridayThirteenth = Task2.FridayThirteenths.findNextFridayThirteenth(LocalDate.of(2022, 5, 20));
        assertEquals(LocalDate.of(2023, 1, 13), nextFridayThirteenth);

        LocalDate nextFridayThirteenth2 = Task2.FridayThirteenths.findNextFridayThirteenth(LocalDate.of(2023, 11, 15));
        assertEquals(LocalDate.of(2023, 10, 13), nextFridayThirteenth2);
    }
}
