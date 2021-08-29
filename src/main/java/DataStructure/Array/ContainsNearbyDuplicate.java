package DataStructure.Array;

import java.util.HashMap;
import java.util.HashSet;


/**
 * Array: Easy
 * 219. Contains Duplicate II
 */

public class ContainsNearbyDuplicate {

    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberIndexMap.containsKey(nums[i]) && Math.abs(i - numberIndexMap.get(nums[i])) <= k) {
                return true;
            }
            numberIndexMap.put(nums[i], i);
        }
        return false;
    }

    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // Sliding Window Approach
    public boolean containsNearbyDuplicateHashSet(int[] nums, int k) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberSet.contains(nums[i])) return true;
            numberSet.add(nums[i]);
            if (numberSet.size() > k) numberSet.remove(nums[i - k]);
        }
        return false;
    }
}
