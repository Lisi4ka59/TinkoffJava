import edu.hw5.Task5;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class RussianCarNumberRegexTest {

    @Test
    public void testValidRussianCarNumbers() {
        String Number1 = "А123ВЕ777";
        assertTrue(Task5.regex(Number1));

        String Number2 = "О777ОО177";
        assertTrue(Task5.regex(Number2));
    }

    @Test
    public void testInvalidRussianCarNumbers() {
        String Number1 = "123АВЕ777";
        assertFalse(Task5.regex(Number1));

        String Number2 = "А123ВГ77";
        assertFalse(Task5.regex(Number2));

        String Number3 = "А123ВЕ7777";
        assertFalse(Task5.regex(Number3));
    }
}
