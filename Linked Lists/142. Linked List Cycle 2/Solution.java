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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && slow != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
               ListNode startpoint = head;
               if (startpoint != slow)
               {
                startpoint = startpoint.next ; 
                slow = slow.next ;
                fast = fast.next;
               } 
               return startpoint;
            }

        }
        return null;
    }
}