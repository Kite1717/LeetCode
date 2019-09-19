class Solution {
    /*
    Runtime: 7 ms, faster than 100.00% of Java online submissions for Super Ugly Number.
Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Super Ugly Number.
*/
    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] indexes = new int[primes.length];
        int[] values =  new int[primes.length];
        for(int i = 0; i < primes.length;i++)
            values[i] = primes[i];
        
        int [] superUgly = new int[n];
        superUgly[0] = 1;
        for(int i = 1; i < n ;i ++)
        {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0 ; j < values.length ; j++)
            {
                if(min > values[j])
                {
                    min = values[j];
                    minIdx = j;
                }
                else  if(min == values[j])
                    values[j] = superUgly[++indexes[j]] * primes[j];

            }
            superUgly[i] = min;

            values[minIdx] = superUgly[++indexes[minIdx]] * primes[minIdx];
        }
        return  superUgly[n-1];
    }
}