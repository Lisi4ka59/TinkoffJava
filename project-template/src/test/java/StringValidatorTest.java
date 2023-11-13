import edu.hw5.Task7;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringValidatorTest {

    @Test
    public void testValidStrings() {
        assertTrue(Task7.StringValidator.validateString("010")); // Должно вернуть true
        assertTrue(Task7.StringValidator.validateString("000")); // Должно вернуть true
    }

    @Test
    public void testInvalidStrings() {
        assertFalse(Task7.StringValidator.validateString("01")); // Должно вернуть false
        assertFalse(Task7.StringValidator.validateString("0000")); // Должно вернуть false
        assertFalse(Task7.StringValidator.validateString("1010")); // Должно вернуть false
        assertFalse(Task7.StringValidator.validateString("11")); // Должно вернуть false
    }

    @Test
    public void testEmptyString() {
        assertFalse(Task7.StringValidator.validateString("")); // Должно вернуть false
    }
}
