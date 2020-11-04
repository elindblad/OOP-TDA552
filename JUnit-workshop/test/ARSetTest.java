import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ARSetTest {
    /** The empty set should have size 0.
     *  If I add the integer 7 to the empty set, then it should contain 7.
     *  The empty set should not contain 7.
     *  If I add the integer 7 to the empty set, it should have size 1.
     *  If I add the integer 7 to the empty set, it should not contain 6.
     */
    
    @Test
    public void emptySetSize() {
        assertEquals(0, new ARSet().size());
    }
    
    @Test
    public void oneElementSet() {
        ARSet set = new ARSet();
        set.add(7);
        assert(set.contains(7));
    }
    
    @Test
    public void emptySetIsEmpty() {
        assert(! new ARSet().contains(7));
    }

    @Test
    public void addsListOk() {
        ARSet set = new ARSet();
        Integer[] arr = {1,2,3};
        set.add(arr);
        assert(set.size()==3);
    }

    @Test
    public void deleteOk() {
        ARSet set = new ARSet();
        set.add(1);
        set.delete(1);
        assert(set.size()==0);
    }

    @Test
    public void unionOk() {
        ARSet set = new ARSet();
        ARSet set1 = new ARSet();
        Integer[] arr = {1,2,3,6};
        Integer[] arr1 = {3,6,1};

        ARSet unionset = set.union(set1);
        assert(unionset.contains(2));
    }
}