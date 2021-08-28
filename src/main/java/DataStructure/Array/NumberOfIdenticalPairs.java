package DataStructure.Array;

import java.util.HashMap;

/**
 * Array : Easy
 * 1512. Number of Good Pairs
 */

public class NumberOfIdenticalPairs {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }
}
