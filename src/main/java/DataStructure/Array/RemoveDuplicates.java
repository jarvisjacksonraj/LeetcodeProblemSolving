package DataStructure.Array;

/**
 * Array : Easy
 * 26. Remove Duplicates from Sorted Array
 */

public class RemoveDuplicates {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int removeDuplicates(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
