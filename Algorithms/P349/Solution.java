class Solution {
    /*
    Runtime: 2 ms, faster than 98.20% of Java online submissions for Intersection of Two Arrays.
Memory Usage: 36.4 MB, less than 90.54% of Java online submissions for Intersection of Two Arrays.
*/
    public int[] intersection(int[] nums1, int[] nums2) {
    
       HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> inter = new ArrayList<>();
       if(nums1.length > nums2.length)
       {
           for(int i = 0; i < nums1.length ;i ++)
               set.add(nums1[i]);

           for(int i = 0; i < nums2.length ;i ++)
               if(set.contains(nums2[i])&& !inter.contains(nums2[i]))
                   inter.add(nums2[i]);
       }
       else {
           for(int i = 0; i < nums2.length ;i ++)
               set.add(nums2[i]);

           for(int i = 0; i < nums1.length ;i ++)
               if(set.contains(nums1[i]) && !inter.contains(nums1[i]))
                   inter.add(nums1[i]);
       }

       int [] arr = new int[inter.size()];
       for(int i = 0; i < arr.length ;i ++)
           arr[i] = inter.get(i);
       return arr;

    }
}