package DataStructure.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Array : Easy
 * 1431. Kids With the Greatest Number of Candies
 */

public class KidsWithCandies {

    // Time Complexity : O(n^2)
    // Space Complexity: O(1)
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> luckyKid = new ArrayList<>();
        Boolean state = false;
        for (Integer candy : candies) {
            int currentCandy = candy + extraCandies;
            for (int i = 0; i < candies.length; i++) {
                if (currentCandy < candies[i]) {
                    state = false;
                    break;
                } else {
                    state = true;
                }
            }
            luckyKid.add(state);
        }
        return luckyKid;
    }

    public List<Boolean> kidsWithCandiesGreedy(int[] candies, int extraCandies) {

        // Time Complexity : O(n)
        // Space Complexity: O(1)
        List<Boolean> luckyKid = new ArrayList<>();
        int maxCandy = Integer.MIN_VALUE;
        for (Integer candy : candies) {
            maxCandy = (maxCandy > candy) ? maxCandy : candy;
        }
        for (Integer candy : candies) {
            luckyKid.add(candy + extraCandies >= maxCandy);
        }
        return luckyKid;
    }

}
