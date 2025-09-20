class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int brick[] = new int[101]; // Increased size
        for (int num : nums) {
            brick[num]++;
        }

        for (int i = 1; i < brick.length; i++) {
            brick[i] += brick[i - 1];
        }

        int result[] = new int[nums.length]; // Declaration inside the method
        for (int i = 0; i < result.length; i++) { // Corrected loop condition
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = brick[nums[i] - 1]; // Corrected access
            }
        }
        return result; // Return outside the loop
    }
}