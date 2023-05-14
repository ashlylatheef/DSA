/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] result = new int[2];
        for (int i = 0; i < numList.size(); i++) {
            int firstnum = numList.get(i);
            if(numList.contains(target - firstnum) && i != numList.indexOf(target - firstnum))           {
                result = new int[] { i, numList.indexOf(target - firstnum)};
                return result;
            }
        }
        return result;
    }
}
 