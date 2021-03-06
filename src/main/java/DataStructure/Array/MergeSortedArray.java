package DataStructure.Array;

/**
 * Array : Easy
 * 88. Merge Sorted Array
 */

public class MergeSortedArray {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int endIndex = nums1.length - 1;

        while (len1 >= 0 && len2 >= 0) {
            nums1[endIndex--] = (nums1[len1] > nums2[len2]) ? nums1[len1--] : nums2[len2--];
        }
        while (len2 >= 0) {
            nums1[endIndex--] = nums2[len2--];
        }
    }
}
