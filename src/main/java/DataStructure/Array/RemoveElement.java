package DataStructure.Array;

/**
 * Array : Easy
 * 27. Remove Element
 */

public class RemoveElement {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int removeElement(int[] A, int elem) {
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[j] = A[i];
                j++;
            }
        }
        return j;
    }
}
