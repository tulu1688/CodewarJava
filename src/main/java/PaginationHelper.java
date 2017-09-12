import java.util.List;

/**
 * Created by trankhai on 9/12/17.
 */
public class PaginationHelper<I> {
    private List<I> collection = null;
    private int itemsPerPage = -1;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        if (collection == null)
            return -1;
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (collection == null)
            return -1;
        return (collection.size() % itemsPerPage == 0) ? (collection.size() / itemsPerPage) : (collection.size() / itemsPerPage + 1);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (collection == null)
            return  -1;
        if (pageIndex < 0)
            return -1;

        if ((pageIndex) * itemsPerPage > collection.size())
            return -1;
        if ((pageIndex + 1) * itemsPerPage <= collection.size())
            return itemsPerPage;
        else
            return collection.size() % itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (collection == null)
            return -1;
        if (itemIndex < 0)
            return -1;

        if (itemIndex >= collection.size())
            return -1;
        return itemIndex / itemsPerPage;
    }
}
