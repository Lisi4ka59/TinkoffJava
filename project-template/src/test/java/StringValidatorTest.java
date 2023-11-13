import edu.hw5.Task7;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringValidatorTest {

    @Test
    public void testMatchingStrings() {
        assertTrue(Task7.StringValidator.validateString("010101")); // Должно вернуть true
        assertTrue(Task7.StringValidator.validateString("0"));      // Должно вернуть true
        assertTrue(Task7.StringValidator.validateString("101"));    // Должно вернуть true
        assertTrue(Task7.StringValidator.validateString("111"));    // Должно вернуть true
    }

    @Test
    public void testNonMatchingStrings() {
        assertFalse(Task7.StringValidator.validateString("1110"));    // Должно вернуть false
        assertFalse(Task7.StringValidator.validateString("11110"));  // Должно вернуть false
        assertFalse(Task7.StringValidator.validateString(""));       // Должно вернуть false
    }
}

