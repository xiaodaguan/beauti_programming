package cn.guanxiaoda.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author guanxiaoda
 * @date 2018/12/12
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> m = new HashMap<>(16);
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            int idx = -1;
            if (m.containsKey(diff) && (idx = m.get(diff)) != i) {
                return new int[]{idx, i};
            }
            m.put(nums[i], i);
        }


        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
