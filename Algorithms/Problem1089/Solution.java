class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Duplicate Zeros.
Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Duplicate Zeros. */
    public void duplicateZeros(int[] arr) {
        int[] aux = arr.clone();
        
        int i = 0;
        int j = 0;
        
        boolean isZero = false;
        for (i = 0; i < arr.length; i++) {
           if (!isZero) {
               int tmp = aux[j];
               arr[i] = tmp;
               if (tmp == 0) {
                   isZero = true;
               }
               j++;
           }else {
               isZero = false;
               arr[i] = 0;
           }
        }
    }
}