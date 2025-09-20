import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }
            hm.put(nums[i], i);
        }
        // In case no solution is found, although the problem statement usually guarantees one.
        return new int[]{-1, -1};
    }
}