class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j ){
           int a = Math.min(height[i] , height[j])  * (j - i);
            maxArea = Math.max( a, maxArea);
             if(height[i] < height[j]){
            i++;
        }
        else {
            j--;
        }
        }
        
        return maxArea ; 
    }
}