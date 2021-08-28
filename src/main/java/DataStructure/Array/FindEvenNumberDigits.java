package DataStructure.Array;

/**
 * Array : Easy
 * 1295. Find Numbers with Even Number of Digits
 */

public class FindEvenNumberDigits {

    // Time Complexity : O(n * log d)
    // Space Complexity: O(1)
    public int findNumbers(int[] nums) {
        int evenNum = 0;
        for (Integer num : nums) {
            if (countNumberOfDigits(num) % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }

    public static int countNumberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //constraint based solution

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int findNumbersConstraints(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || nums[i] == 100000) {
                count++;
            }
        }
        return count;
    }
}
