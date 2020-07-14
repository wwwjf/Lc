package com.wwwjf.leetcode;

import java.util.HashMap;

public class NumPairs {

    public static int numIdenticalPairs(int[] nums) {
        int[] counter = new int[101];
        int total = 0;
        for(int d : nums) {
            ++counter[d];
            total += counter[d] - 1;
        }
        return total;
    }
}
