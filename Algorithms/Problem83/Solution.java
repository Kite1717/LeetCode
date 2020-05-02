class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode iter = head;


        while (iter != null && iter.next != null)
        {
            if(iter.val == iter.next.val)
            {
                iter.next = iter.next.next;
            }
            else  iter = iter.next;
        }
        return  head;

    }
}