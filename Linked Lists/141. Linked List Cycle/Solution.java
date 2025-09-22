/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        /*for good practice add && slow!= null since the pointer might not always start from head in other cases like interviews i added it here*/
        while(fast != null &&  fast.next != null  && slow != null)
        {
            slow = slow.next ;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
            
        }
        return false;
        
    }
}