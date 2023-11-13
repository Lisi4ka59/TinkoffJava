import edu.hw5.Task3;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateParserTest {

    @Test
    public void testParseDateValidFormats() {
        Optional<LocalDate> result1 = Task3.DateParser.parseDate("2020-10-15");
        assertEquals(LocalDate.of(2020, 10, 15), result1.orElse(null));

        Optional<LocalDate> result2 = Task3.DateParser.parseDate("1/3/1976");
        assertEquals(LocalDate.of(1976, 1, 3), result2.orElse(null));

        Optional<LocalDate> result3 = Task3.DateParser.parseDate("tomorrow");
        assertEquals(LocalDate.now().plusDays(1), result3.orElse(null));
    }

    @Test
    public void testParseDateInvalidFormats() {
        Optional<LocalDate> result1 = Task3.DateParser.parseDate("2020-15-10");
        assertFalse(result1.isPresent());

        Optional<LocalDate> result2 = Task3.DateParser.parseDate("31/3/1976");
        assertFalse(result2.isPresent());

        Optional<LocalDate> result3 = Task3.DateParser.parseDate("random string");
        assertFalse(result3.isPresent());
    }
}
