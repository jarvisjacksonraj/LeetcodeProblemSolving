package DataStructure.Array;

/**
 * Array: Easy
 * 977. Squares of a Sorted Array
 */

public class SquaresSortedArray {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int lastIndex = nums.length - 1;
        int result[] = new int[nums.length];
        while (start <= end) {
            int startSqr = nums[start] * nums[start];
            int endSqr = nums[end] * nums[end];
            if (startSqr < endSqr) {
                result[lastIndex--] = endSqr;
                end--;
            } else {
                result[lastIndex--] = startSqr;
                start++;
            }
        }
        return result;
    }
}
