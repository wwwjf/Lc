package com.wwwjf;

import com.wwwjf.algorithm.Sort;
import com.wwwjf.leetcode.*;

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

        ListNode listNode1 = new ListNode(4);
        ListNode listNode11 = new ListNode(7);
        ListNode listNode111 = new ListNode(9);
        listNode1.next = listNode11;
        listNode11.next = listNode111;
        ListNode listNode2 = new ListNode(8);
        ListNode listNode22 = new ListNode(9);
        ListNode listNode222 = new ListNode(5);
        listNode2.next = listNode22;
        listNode22.next = listNode222;
        TwoPlus.addTwoNumbers(listNode1, listNode2);

        int sub = SubString.lengthOfLongestSubstring("abcdaaeklaabcde");
        System.out.println("sub="+sub);

        System.out.println("================");
        int[] numsPair =new int[]{1,2,3,1,1,3};
        System.out.println(NumPairs.numIdenticalPairs(numsPair));
        System.out.println("================");
        for (int i : DynamicSum.runningSum(new int[]{1, 2, 3, 4})) {
            System.out.println("---i="+i);
        }

        System.out.println(StringRevese.reverseLeftWords("abcdefg"));

    }


}
