
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length < 3 || nums.equals(null)) return ret;

        for (int i = 0; i < nums.length; i++) {

            Map<Integer, Integer> map = new HashMap<>();
            int target = 0 - nums[i];

            for (int j = i+1; j < nums.length; j++) {

                int carry = target - nums[j];

                if (map.containsKey(carry)) {
                    ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], carry, nums[j]));

                    Collections.sort(temp);
                    boolean flag = true;
                    for (List<Integer> item : ret) {

                        if (item.equals(temp)) {
                            flag = false;
                        }
                    }
                    if (flag)
                    {
                        ret.add(temp);
                        System.out.println(temp);
                    }

                }
                map.put(nums[j], j);
            }

        }

        return ret;

    }
}

