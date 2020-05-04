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
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Linked List Cycle.
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            if (prev == curr) return true;
            prev.next = prev;
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}