import edu.hw5.Task4;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PasswordRegexTest {

    @Test
    public void testPasswordContainsSpecialCharacter() {
        String password1 = "securePassword!";
        assertTrue(Task4.regex(password1));

        String password2 = "anotherPassword^";
        assertTrue(Task4.regex(password2));
    }

    @Test
    public void testPasswordDoesNotContainSpecialCharacter() {
        String password1 = "weakPassword";
        assertFalse(Task4.regex(password1));

        String password2 = "evenWeaker";
        assertFalse(Task4.regex(password2));
    }
}
