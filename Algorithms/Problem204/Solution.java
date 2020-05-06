class Solution {
    /*
    Runtime: 8 ms, faster than 95.83% of Java online submissions for Count Primes.
Memory Usage: 34.3 MB, less than 9.43% of Java online submissions for Count Primes. */
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n + 1];
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                for (int j = i; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans += notPrime[i] ? 0 : 1;
        }
        return ans;
    }
}