/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      ListNode reverseList(ListNode head)
        {
            ListNode previous = null;
            while(head != null)
            {
                ListNode next = head.next;
                head.next = previous ;
                previous = head;
                head = next ;
            }
            return previous;
        }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head ;
        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next ;
        }
        slow = reverseList(slow);
        fast = head;
        while(slow != null)
        {
            if(fast.val != slow.val)
            {
                return false ;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
      
    }
}