
class Solution {
    
    /*
    Runtime: 1 ms, faster than 56.24% of Java online submissions for Two Sum II - Input array is sorted.
Memory Usage: 37.9 MB, less than 96.27% of Java online submissions for Two Sum II - Input array is sorted.
     */
    public int[] twoSum(int[] numbers, int target) {
        int left =  0;
        int right = numbers.length -1;

        while (left <= right)
        {
            if(numbers[left] + numbers[right] == target) return  new int[]{left + 1 , right + 1 };
            if(numbers[left] + numbers [right] < target) left ++;
            if(numbers[left] + numbers[right] > target) right--;
        }
          throw  new IllegalArgumentException("No two sum solution");
    }

    }