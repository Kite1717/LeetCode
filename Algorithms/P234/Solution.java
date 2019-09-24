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
    Runtime: 1 ms, faster than 99.09% of Java online submissions for Palindrome Linked List.
Memory Usage: 39.7 MB, less than 98.78% of Java online submissions for Palindrome Linked List.
*/
   
    public boolean isPalindrome(ListNode head) {
        
ListNode slow = head, fast = head, prev = null, tmp = null;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }

        
       
        if (fast != null) slow = slow.next;
        while (slow != null) {
            if (prev.val != slow.val) return false;
            prev = prev.next;
            slow = slow.next;
        }
              
        return true;
    }
}