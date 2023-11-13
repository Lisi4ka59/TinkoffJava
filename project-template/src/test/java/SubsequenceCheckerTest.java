import edu.hw5.Task6;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SubsequenceCheckerTest {

    @Test
    public void testSubsequenceIsPresent() {
        String s = "abc";
        String t = "achfdbaabgabcaabg";
        assertTrue(Task6.SubsequenceChecker.isSubsequence(s, t));
    }

    @Test
    public void testSubsequenceIsNotPresent() {
        String s = "def";
        String t = "achfdbaabgabcaabg";
        assertFalse(Task6.SubsequenceChecker.isSubsequence(s, t));
    }

    @Test
    public void testEmptyString() {
        String s = "";
        String t = "achfdbaabgabcaabg";
        assertTrue(Task6.SubsequenceChecker.isSubsequence(s, t));
    }

    @Test
    public void testSameStrings() {
        String s = "achfdbaabgabcaabg";
        String t = "achfdbaabgabcaabg";
        assertTrue(Task6.SubsequenceChecker.isSubsequence(s, t));
    }

    @Test
    public void testLongStrings() {
        String s = "mnopqrstuvwxyz";
        String t = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(Task6.SubsequenceChecker.isSubsequence(s, t));
    }
}
