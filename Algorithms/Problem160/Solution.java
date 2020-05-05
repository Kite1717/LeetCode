/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Intersection of Two Linked Lists.
Memory Usage: 38.8 MB, less than 40.71% of Java online submissions for Intersection of Two Linked Lists.
*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       
        ListNode a = headA , b = headB;

        int lenA = 0, lenB = 0;
        while (a != null) {
            lenA ++;
            a = a.next;
        }
        while (b != null)
        {
            lenB ++;
            b = b.next;
        }

        int diff = lenA - lenB;
        if( diff > 0)
        {
            for(int i = 0; i < diff ;i++) headA = headA.next;
        }
        else {
            diff *=-1;
            for(int i = 0; i  < diff ;i++) headB = headB.next;
        }
        
        while (headA != headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
         
        return  headA;
    }
}