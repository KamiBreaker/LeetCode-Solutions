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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummynode = new ListNode(Integer.MIN_VALUE);
        ListNode resultnode = dummynode ;
        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                dummynode.next = list1;
                list1 = list1.next;
            }
            else
            {
                dummynode.next = list2;
                list2=list2.next;
            }
            dummynode = dummynode.next;
        }
        if(list1 == null)
        {
            dummynode.next = list2;
        }
        else if(list2 == null)
        {
            dummynode.next = list1;
        }
        return resultnode.next; // if we return only result then a ridiculously large negative number comes off which is the initialization of first node given as integer.min_valie
    }
}