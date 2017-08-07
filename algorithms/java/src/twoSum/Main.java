package twoSum;

import java.util.Arrays;

/**
 * Created by kennyliubj on 07/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int expect[] = {0, 1};

        assert Arrays.equals(new Solution().twoSum(nums, target), expect);
    }
}
