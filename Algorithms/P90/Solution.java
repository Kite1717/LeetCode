class Solution {
    /*
    Runtime: 1 ms, faster than 99.83% of Java online submissions for Subsets II.
Memory Usage: 37.4 MB, less than 98.53% of Java online submissions for Subsets II.
*/
  public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return subs;
        }

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        dfs(nums, subs, list, 0);

        return subs;
    }

    private void dfs(int[] nums, List<List<Integer>> subs,  List<Integer> list, int index){
        subs.add(new ArrayList<>(list));

        for(int i = index; i < nums.length; i++){

            if(i == index || nums[i] != nums[i - 1]){

                list.add(nums[i]);
                dfs(nums, subs, list, i + 1);
                list.remove(list.size() - 1);

            }
        }
    }
}