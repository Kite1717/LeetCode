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
    Runtime: 1 ms, faster than 98.30% of Java online submissions for Remove Linked List Elements.
Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Remove Linked List Elements.
*/
    public ListNode removeElements(ListNode head, int val) {
    
   while (head != null)
			if (head.val == val) head = head.next;
			else break;
		if (head == null) return head;

		ListNode node = head;
		while (node.next != null) {
			if (node.next.val == val) node.next = node.next.next;
			else node = node.next;
		}
		
		return head;
    }
}