class Solution {
    public int maxSubArray(int[] nums) {//kadanes algorithm
        int max = nums[0];
        int currentmax = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            currentmax =  Math.max(nums[i] ,nums[i]+ currentmax);
            max = Math.max(max , currentmax);
      }
      return max; 
    }
}