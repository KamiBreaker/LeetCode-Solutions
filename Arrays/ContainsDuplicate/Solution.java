import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dupset = new HashSet<>();
        for(int num : nums){
            if(dupset.contains(num)){
                return true;
            }
            else{
            dupset.add(num);
            
        }
        }
       return false; 
    }
}