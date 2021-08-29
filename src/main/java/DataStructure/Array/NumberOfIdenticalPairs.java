package DataStructure.Array;

import java.util.HashMap;

/**
 * Array: Easy
 * 1512. Number of Good Pairs
 */

public class NumberOfIdenticalPairs {

    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> numberCountMap = new HashMap<>();
        for (int num : nums) {
            if (numberCountMap.containsKey(num)) {
                count += numberCountMap.get(num);
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                numberCountMap.put(num, 1);
            }
        }
        return count;
    }
}
