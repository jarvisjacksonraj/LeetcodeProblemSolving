package DataStructure.Array;

import java.util.Arrays;
import java.util.HashSet;


/**
 * Array : Easy
 * 217. Contains Duplicate
 */

public class ContainsDuplicateNumber {

    // Time Complexity : O(nLogn)
    // Space Complexity: O(1)
    public boolean containsDuplicateSort(int[] nums) {
        //Sorting Array in Ascending order
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer num : nums) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}
