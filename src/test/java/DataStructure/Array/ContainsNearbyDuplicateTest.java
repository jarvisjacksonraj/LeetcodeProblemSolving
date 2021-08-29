package DataStructure.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsNearbyDuplicateTest {

    @Test
    public void TestContainsNearbyDuplicateHashSet(){
        ContainsNearbyDuplicate containsNearbyDuplicate = new ContainsNearbyDuplicate();
        assertTrue(containsNearbyDuplicate.containsNearbyDuplicateHashSet(new int[]{1,2,3,1},4));
        assertTrue(containsNearbyDuplicate.containsNearbyDuplicateHashSet(new int[]{1,0,1,1},1));
        assertFalse(containsNearbyDuplicate.containsNearbyDuplicateHashSet(new int[]{1,2,3,1,2,3},2));
    }
}
