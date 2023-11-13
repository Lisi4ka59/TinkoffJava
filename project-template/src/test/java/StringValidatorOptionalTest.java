import edu.hw5.Task8;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class StringValidatorOptionalTest {


// Строк таких, чтобы выполнялись все условия одновременно не существует

    @Test
    public void testInvalidStrings() {
        assertFalse(Task8.StringValidator.validateString("01"));    // Должно вернуть false
        assertFalse(Task8.StringValidator.validateString("0000"));  // Должно вернуть false
        assertFalse(Task8.StringValidator.validateString("1010"));  // Должно вернуть false
        assertFalse(Task8.StringValidator.validateString("11"));    // Должно вернуть false
        assertFalse(Task8.StringValidator.validateString(""));      // Должно вернуть false
    }
}
