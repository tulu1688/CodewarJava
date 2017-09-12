import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

    @Test
    public void testMultipleCharacterOccur() {
        assertEquals(true, DuplicateEncoder.isMultipleOccur("hahaha", 'a'));
        assertEquals(false, DuplicateEncoder.isMultipleOccur("khai", 'a'));
    }
}