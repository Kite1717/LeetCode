class Solution {
    
    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Relative Sort Array.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Relative Sort Array. */
    public  int[] relativeSortArray(int[] arr1,int[]arr2)
    {
        //using counting sort algorithms
      int [] count = new int[1001];
      int [] temp = new int[arr1.length];

      //counting valid numbers
      for(int i = 0; i< arr1.length;i++)count[arr1[i]]++;
      int start = 0;

      // relative sorting
      for(int i= 0; i < arr2.length ;i++)
      {
        while (count[arr2[i]] > 0)
        {
            temp[start] = arr2[i];
            count[arr2[i]]--;
            start++;
        }
      }
      //sorting for the remainder numbers
        for(int i= 0; i < count.length;i++)
        {
            while (count[i] > 0)
            {
                temp[start] = i;
                count[i]--;
                start++;
            }
        }
      return  temp;
    }
}
