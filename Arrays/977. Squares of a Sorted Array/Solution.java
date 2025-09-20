class Solution {
    public int[] sortedSquares(int[] nums) {

            int[] index = new int[nums.length];
            for(int i = 0 ; i < nums.length ; i++)
            {
                nums[i] =  nums[i] * nums[i];
            } 
            int uno =  0  ;
            int dos = nums.length - 1 ;
            for(int position =  nums.length - 1 ; position >= 0 ; position--)
            {
                if(nums[dos] > nums[uno]){
                    index[position] = nums[dos];
                    dos--;
                }
                else{
                    index[position] =nums[uno];
                    uno++;
                }
            }
          return index ;   
    }
       
}