/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 36.8 MB, less than 99.28% of Java online submissions for Reverse Linked List.
*/
    public ListNode reverseList(ListNode head) {
        //corner case
        if( head == null) return  null;
        
        ListNode reverse = new ListNode(head.val);
        head = head.next;
        while (head != null)
        {
            ListNode item = new ListNode(head.val);
            item.next = reverse;
            reverse = item;
            head = head.next;

        }
        return reverse;
    }
}