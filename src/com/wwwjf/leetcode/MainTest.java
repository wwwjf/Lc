package com.wwwjf.leetcode;

public class MainTest {
    public static void main(String[] args){

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result;
//        result = TwoSum.method1(nums,target);
        result = TwoSum.method2(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
