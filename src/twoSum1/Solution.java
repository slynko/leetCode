package twoSum1;

import java.util.Map;
import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) throws Exception
  {
    Map<Integer, Integer> numbers = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numbers.containsKey(target - nums[i])) {
        return new int[] {numbers.get(target - nums[i]), i};
      }
      numbers.put(nums[i], i);
    }
    throw new Exception("No such combination");
  }
}

