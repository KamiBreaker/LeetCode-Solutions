class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0 ;
        for(int i = 0 ; i <= n; i++)
        {
            String binary = Integer.toBinaryString(i);
            int countone = count1(binary) ;
            ans[i] = countone;
        }
        return ans;
        
    }
    private int count1(String nums){
        int count = 0;
        for(int i = 0 ; i < nums.length() ; i++)
        {
            if(nums.charAt(i) == '1')
            {
                count++;
            }
        }
        return count ;
    }
}