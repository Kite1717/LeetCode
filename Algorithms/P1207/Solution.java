class Solution {
    /*
Runtime: 2 ms, faster than 88.34% of Java online submissions for Unique Number of Occurrences.
Memory Usage: 35.4 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
*/
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i,map.getOrDefault(i,0) + 1);
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}