package twoSum1;

import java.util.Arrays;

public class Demo
{
  public static void main(String[] args) throws Exception
  {
    int[] nums = new int[] {2, 7, 11, 15};
    int target = 9;

    Arrays.stream(new Solution().twoSum(nums, target))
        .forEach(System.out::println);
  }
}
