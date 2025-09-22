class Solution {
    public int climbStairs(int n) {
        if(n == 1){return 1 ;}
        int dparray[] = new int[n+1];
        dparray[1] = 1;
        dparray[2] = 2;
        for(int i = 3 ; i <= n ; i++)
        {
            dparray[i] = dparray[i-1] + dparray[i-2];

        }
        return dparray[n];
        
    }
}