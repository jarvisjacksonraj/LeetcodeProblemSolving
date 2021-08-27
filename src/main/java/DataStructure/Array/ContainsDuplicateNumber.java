package DataStructure.Array;

import java.util.Arrays;
import java.util.HashSet;


/**
 * Array : Easy
 * 217. Contains Duplicate
 */

public class ContainsDuplicateNumber {

    // Time Complexity : O(nlogn)
    // Space Complexity: O(1)
    public boolean containsDuplicateSort(int[] nums) {
        //Sorting DataStructure.Array in Ascending order
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
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
