package com.wwwjf;

import com.wwwjf.algorithm.Sort;
import com.wwwjf.leetcode.TwoSum;

public class MainTest {
    public static void main(String[] args){

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result;
//        result = TwoSum.method1(nums,target);
        result = TwoSum.method2(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

        System.out.println("-------------");

        int[] sortNum = Sort.bubbleSort(nums);
        for (int i = 0; i < sortNum.length; i++) {
            System.out.println("sortNum["+i+"]"+sortNum[i]);
        }
        System.out.println("-------------");

        nums = new int[]{5,3,9,4,7,8,1,2,6};
//        int[] quickSortNum = Sort.quickSort(nums);
        int[] quickSortNum = Sort.quickSort(nums);
        for (int num : quickSortNum) {
            System.out.printf(num+",");
        }
        System.out.println();
    }


}
