import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class RunesTest {
    @Test
    public void testSample() {
        assertEquals( "Answer for expression '1+1=?' " , 2 , Runes.solveExpression("1+1=?") );
        assertEquals( "Answer for expression '123*45?=5?088' " , 6 , Runes.solveExpression("123*45?=5?088") );
        assertEquals( "Answer for expression '-5?*-1=5?' " , 0 , Runes.solveExpression("-5?*-1=5?") );
        assertEquals( "Answer for expression '19--45=5?' " , -1 , Runes.solveExpression("19--45=5?") );
        assertEquals( "Answer for expression '??*??=302?' " , 5 , Runes.solveExpression("??*??=302?") );
        assertEquals( "Answer for expression '?*11=??' " , 2 , Runes.solveExpression("?*11=??") );
    }

    @Test
    public void testValidateExpression(){
        assertEquals(true, Runes.isValidExpression("1+2=3"));
        assertEquals(false, Runes.isValidExpression("1+2=5"));
        assertEquals(true, Runes.isValidExpression("-1+2=1"));
        assertEquals(false, Runes.isValidExpression("-1+2=2"));
        assertEquals(true, Runes.isValidExpression("10*2=20"));
        assertEquals(true, Runes.isValidExpression("-10*2=-20"));
        assertEquals(false, Runes.isValidExpression("10*2=3"));
        assertEquals(true, Runes.isValidExpression("1-2=-1"));
        assertEquals(true, Runes.isValidExpression("4-2=2"));
        assertEquals(true, Runes.isValidExpression("-1-20=-21"));
        assertEquals(false, Runes.isValidExpression("-1-2=3"));
        assertEquals(false, Runes.isValidExpression("1-2=3"));
        assertEquals(true, Runes.isValidExpression("-1--2=1"));
    }

}