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
    public ListNode middleNode(ListNode head) {
    int total = 0 ; 
    ListNode current = head ;
    while(current != null)
    {
        total++;
        current = current.next;
    }
    int middle = total / 2 ;
    current = head ;
    for(int i = 0 ; i < middle ; i++)
    {
        current = current.next;
    }
    return current ;
    }
}