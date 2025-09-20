class Solution {
    public boolean isPalindrome(int x) {

        System.out.println("enter a number");
        int nochange = x;
        int reverse = 0;
        while (x > 0){
            int lastdigit = x % 10 ;
            reverse = reverse * 10 + lastdigit;
            x = x / 10 ;     
        }
        return reverse == nochange;
    }
    }
   
