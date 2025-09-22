class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res , new ArrayList<>(), nums , 0  );
            return res;
    }
       private void backtrack(List<List<Integer>> rs, List<Integer> tempset , int nums[], int start )
        {
            rs.add(new ArrayList<>(tempset));
            for(int i = start ; i <nums.length ; i++)
            {
                tempset.add(nums[i]);
                backtrack(rs , tempset , nums , i+1 );
                tempset.remove(tempset.size() - 1 );
            }
        }
        
    }