package com.wwwjf.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    /**
     * 时间复杂度o(n²)
     * 空间复杂度o(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] method1(int[] nums, int target) {
        int[] targetArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    targetArray[0] = i;
                    targetArray[1] = j;
                }
            }
        }
        return targetArray;
    }

    /**
     * 时间复杂度o(n)
     * 空间复杂度o(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] method2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
