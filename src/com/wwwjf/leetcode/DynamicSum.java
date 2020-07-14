package com.wwwjf.leetcode;

/**
 * 数组动态和
 */
public class DynamicSum {
    public static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("++++++++" + sum);
            sum += nums[i];
            result[i]=sum;
        }
        return result;
    }
}
