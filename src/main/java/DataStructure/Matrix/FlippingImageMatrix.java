package DataStructure.Matrix;

/**
 * Matrix: Easy
 * 832. Flipping an Image
 */

public class FlippingImageMatrix {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int[][] flipAndInvertImage(int[][] image) {

        int columnSize = image[0].length;

        //Flipping Row by Row
        for (int[] row : image)
            //flip  the number while swapping it 'Ith' from last with 'Ith' index
            for (int i = 0; i < (columnSize + 1) / 2; i++) {
                int temp = row[i];
                row[i] = 1 - row[columnSize - 1 - i];
                row[columnSize - 1 - i] = 1 - temp;
            }
        return image;
    }
}
