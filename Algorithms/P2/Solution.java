package com.LeetCode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0); // bir ileriki düğüm geri dönüdürülecek
        ListNode z = node; // iteratör
        int carry=0,sum,a,b; // elde toplam l1 l2 şuanki düğüm değerleri
        while (l1 != null || l2 != null)
        {
             a = (l1 != null) ? l1.val : 0;
              b = (l2 != null) ? l2.val : 0;
              sum = carry + a + b ;
            carry = sum / 10;
            z.next = new ListNode(sum %10);
            z = z.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
         if( carry > 0) z.next = new ListNode(carry);
        return  node.next;
    }


}

