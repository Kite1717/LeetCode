class Solution {
    
/*
Runtime: 1 ms, faster than 95.02% of Java online submissions for Happy Number.
Memory Usage: 33.5 MB, less than 10.60% of Java online submissions for Happy Number.
*/
   public boolean isHappy(int n)
    {
        //corner case
        if(n <= 0) return  false;
        HashSet<Integer>  set = new HashSet<>();

        while (set.add(n))
        {
            int sum = 0;
            while (n != 0)
            {
                sum += (n % 10) * (n % 10);
                n /=10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return  false;
    }
}