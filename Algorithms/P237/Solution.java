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
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
*/
    public void deleteNode(ListNode node) {
         node.val = node.next.val;
       node.next = node.next.next;
    }
}