import org.junit.Assert;
import org.junit.Test;

/**
 * Created by trankhai on 9/15/17.
 */
public class ValidBraceTest {
    private ValidBraces checker = new ValidBraces();

    @Test
    public void testValid() {
        Assert.assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        Assert.assertEquals(false, checker.isValid("}[(])"));
        Assert.assertEquals(false, checker.isValid("[(])"));
    }
}
