import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by trankhai on 9/12/17.
 */
public class PaginationHelperTest {
    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

    @Test
    public void testPagination() {
        assertEquals(2,helper.pageCount()); //should == 2
        assertEquals(6, helper.itemCount()); //should == 6
        assertEquals(4, helper.pageItemCount(0)); //should == 4
        assertEquals(2, helper.pageItemCount(1)); // last page - should == 2
        assertEquals(-1, helper.pageItemCount(2)); // should == -1 since the page is invalid

        // pageIndex takes an item index and returns the page that it belongs on
        assertEquals(1, helper.pageIndex(5)); //should == 1 (zero based index)
        assertEquals(0, helper.pageIndex(2)); //should == 0
        assertEquals(-1, helper.pageIndex(20)); //should == -1
        assertEquals(-1, helper.pageIndex(-10)); //should == -1
    }
}
