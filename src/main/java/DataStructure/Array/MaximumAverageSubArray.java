package DataStructure.Array;

/**
 * Array: Easy
 * 643. Maximum Average Subarray I
 */

public class MaximumAverageSubArray {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        double resultSum = Integer.MIN_VALUE, windowSum = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            if (windowEnd >= k - 1) {
                resultSum = (resultSum > windowSum) ? resultSum : windowSum;
                windowSum -= nums[windowStart++];
            }
        }
        return resultSum / k;
    }
}
