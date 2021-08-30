package DataStructure.Array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
    }
}
