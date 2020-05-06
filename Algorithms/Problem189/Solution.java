class Solution {

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
Memory Usage: 37.7 MB, less than 99.04% of Java online submissions for Rotate Array
*/
    public void rotate(int[] nums, int k) {
        int[] arrayCopy = new int[nums.length];
        System.arraycopy(nums, 0, arrayCopy, 0, nums.length);
        int ind = 0;
        for (int x : arrayCopy) {
            nums[ind+k >= nums.length ? (ind+k)%nums.length : ind+k] = x;
            ind++;
        }
    }
}