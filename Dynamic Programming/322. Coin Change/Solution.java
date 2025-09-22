class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1 ){ return 0 ;}
        int dparray[] = new int[amount + 1 ];
        
        for(int i = 1; i <= amount ; i++)
        {
            dparray[i] = Integer.MAX_VALUE;
            for(int coin : coins)
            {
                if(coin <=i && dparray[i - coin] != Integer.MAX_VALUE)
                {
                    dparray[i]= Math.min(dparray[i] ,  1 + dparray[i - coin]);
                }
            }

        }
        if(dparray[amount] == Integer.MAX_VALUE){ return -1 ;}
        return dparray[amount];

        
    }
}