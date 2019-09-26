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
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate List.
Memory Usage: 38.3 MB, less than 63.79% of Java online submissions for Rotate List.
*/
    public ListNode rotateRight(ListNode head, int k) {

         //corner case
        if(head == null ) return  null;

        int len = 0;
        ListNode current = head;
        while (current != null)
        {
            len++;
            current = current.next;
        }
          k = k % len;
          if( k == 0) return  head;

        ListNode firstPart = head;
        for(int i = 0; i < len - k ;i++)
        {
            firstPart = firstPart.next;
        }

        ListNode lastPart = firstPart;
        ListNode temp = lastPart;
        while (firstPart.next != null)
        {
            lastPart.next  = firstPart.next;

            lastPart = lastPart.next;
            firstPart = firstPart.next;
        }


         for(int i = 0; i < len - k ;i ++)
         {
             lastPart.next =  new ListNode(head.val);
             head = head.next;
             lastPart = lastPart.next;
         }
        return  temp;
    }
}