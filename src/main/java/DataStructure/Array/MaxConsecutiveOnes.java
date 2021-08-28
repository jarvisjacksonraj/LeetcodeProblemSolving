package DataStructure.Array;

/**
 * Array : Easy
 * 485. Max Consecutive Ones
 */

public class MaxConsecutiveOnes {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, count = 0;
        for (Integer num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxOnes = (maxOnes > count) ? maxOnes : count;
        }
        return maxOnes;
    }
}
